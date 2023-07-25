package com.allron;

import com.allron.javalearn.thread.CountDownLatchExample.ThreadUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CountDownLatch;

/**
 * TODO
 *
 * @author allron
 * @date 2023/6/6 17:27
 */
@SpringBootApplication
@Slf4j
@RestController
@RequestMapping("/java/")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @PostMapping("/hello")
    public String hello(){
        try {
            log.info("开始睡眠");
            Thread.sleep(10000);
            log.info("继续执行");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "java-learn";
    }

    @PostMapping("/test")
    public String test() throws InterruptedException {
        System.out.println("test方法当前执行线程：" + Thread.currentThread().getName());
        return "test success";
    }

    @PostMapping("/countDownLatchTest")
    public String countDownLatchTest() throws InterruptedException {
        int threadNum = 5;
        CountDownLatch latch = new CountDownLatch(threadNum);
        for (int i = 0; i < threadNum; i++) {
            ThreadUtils.execute(() -> {
                try {
                    System.out.println("countDownLatchTest方法当前执行branch线程：" + Thread.currentThread().getName());
                    Thread.sleep(30 * 1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                latch.countDown();
            });
        }
        latch.await();
        System.out.println("countDownLatchTest方法当前执行main线程：" + Thread.currentThread().getName());
        return "success";
    }
}