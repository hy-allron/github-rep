package com.allron.redislearn.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * redis服务
 *
 * @author allron
 * @date 2023/6/16 15:10
 */
@Component
public class RedisService {
    private final RedisTemplate<String, String> redisTemplate;

    @Autowired
    public RedisService(RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    // 在这里定义你的Redis操作方法
    // 例如：添加键值对
    public void addKeyValue(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    // 例如：获取键对应的值
    public String getValue(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    // 添加有序集合元素
    public void addToZSet(String key, String value, double score) {
        redisTemplate.opsForZSet().add(key, value, score);
    }

    // 获取有序集合指定范围内的元素
    public Set<String> getRangeFromZSet(String key, long start, long end) {
        return redisTemplate.opsForZSet().range(key, start, end);
    }

    // 获取有序集合指定范围内的元素和分数
    public Set<ZSetOperations.TypedTuple<String>> getRangeWithScoresFromZSet(String key, long start, long end) {
        return redisTemplate.opsForZSet().rangeWithScores(key, start, end);
    }

    // 获取有序集合指定元素的分数
    public Double getScoreFromZSet(String key, String value) {
        return redisTemplate.opsForZSet().score(key, value);
    }

    // 移除有序集合中的元素
    public Long removeFromZSet(String key, String... values) {
        return redisTemplate.opsForZSet().remove(key, values);
    }

    // 获取有序集合在指定分数范围内的元素
    public Set<String> getRangeByScoreFromZSet(String key, double minScore, double maxScore) {
        return redisTemplate.opsForZSet().rangeByScore(key, minScore, maxScore);
    }

    // 获取有序集合在指定分数范围内的元素和分数
    public Set<ZSetOperations.TypedTuple<String>> getRangeByScoreWithScoresFromZSet(String key, double minScore, double maxScore) {
        return redisTemplate.opsForZSet().rangeByScoreWithScores(key, minScore, maxScore);
    }
}
