package com.allron.redislearn;

import com.allron.redislearn.component.RedisService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ZSetOperations;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

@SpringBootTest
class RedisLearnApplicationTests {

    private static final String TEST_KEY = "test_key";

    /*@Autowired
    private RedisService redisService;*/
    
    @Resource
    private RedisTemplate redisTemplate;
    
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @BeforeEach
    public void setup() {
        // 在每个测试方法执行前清空 Redis 中的数据
        stringRedisTemplate.delete(TEST_KEY);
    }

    @Test
    public void testIsAllowedWithinLimit() {
        int limit = 5;
        long period = 1000; // 1秒时间窗口

        // 执行 5 次请求，应该都允许通过
        for (int i = 0; i < limit; i++) {
            boolean allowed = isAllowed(TEST_KEY, limit, period);
            Assertions.assertTrue(allowed);
        }
    }

    @Test
    public void testIsAllowedExceedLimit() throws InterruptedException {
        int limit = 5;
        long period = 1000; // 1秒时间窗口

        // 执行超过 5 次请求，只有前 5 次应该允许通过
        for (int i = 0; i < limit + 1; i++) {
            boolean allowed = isAllowed(TEST_KEY, limit, period);

            if (i < limit) {
                Assertions.assertTrue(allowed);
            } else {
                Assertions.assertFalse(allowed);
            }

            // 等待一段时间，确保时间窗口过期
            Thread.sleep(200);
        }
    }
    
    @Test
    void contextLoads() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("第" + (i + 1) + "次访问结果：" + limitFlow());
            Thread.sleep(10000);
        }
    }

    public String limitFlow(){
        Long currentTime = new Date().getTime();
        Long intervalTime = 5000L;
//        System.out.println(currentTime);
        if(redisTemplate.hasKey("limit")) {
            Integer count = redisTemplate.opsForZSet().rangeByScore("limit", currentTime -  intervalTime, currentTime).size();        // intervalTime是限流的时间 
//            System.out.println(count);
            if (count != null && count > 5) {
                return "最多只能访问5次";
            }
        }
        redisTemplate.opsForZSet().add("limit", UUID.randomUUID().toString(),currentTime);
        return "访问成功";
    }

    // 限流方法
    public boolean isAllowed(String key, int limit, long period) {
        long currentTime = System.currentTimeMillis();

        // 计算时间窗口的起始时间
        long startTime = currentTime - period;

        // 移除时间窗口之前的数据
        stringRedisTemplate.opsForZSet().removeRangeByScore(key, 0, startTime);

        // 获取时间窗口内的请求数量
        Set<ZSetOperations.TypedTuple<String>> range = stringRedisTemplate.opsForZSet().rangeByScoreWithScores(key, startTime, currentTime);

        // 判断请求数量是否超过限流阈值
        if (range != null && range.size() >= limit) {
            return false; // 超过限流阈值，不允许请求通过
        }

        // 添加当前请求的时间戳到有序集合
        stringRedisTemplate.opsForZSet().add(key, String.valueOf(currentTime), currentTime);

        return true; // 请求通过限流
    }
}
