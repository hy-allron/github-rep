package com.allron.javalearn.thread;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * jdk1.8特性 CompletableFuture
 *
 * @author allron
 * @date 2022/6/13 10:59
 */
@RestController
public class CompletableFutureTest {
    
    @GetMapping("/test/task")
    public String task(){
        
        return "ok";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long currentTime = System.currentTimeMillis();
        System.out.println(getThreadName() + ": 业务1");
        CompletableFuture<String> task = CompletableFuture.supplyAsync(() -> {
            System.out.println(getThreadName() + ": supplyAsync");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "123";
        });

        System.out.println(getThreadName() + ": 业务2");
        
        CompletableFuture<Integer> result1 = task.thenApply(number -> {
            System.out.println(getThreadName() + ": thenApply1");
            return Integer.parseInt(number);
        });

        CompletableFuture<Integer> result2 = result1.thenApply(number -> {
            System.out.println(getThreadName() + ": thenApply2");
            return number * 2;
        });

        System.out.println(getThreadName() + " => " + result2.get());
        System.out.println(getThreadName() + ": 业务3");
        long endTime = System.currentTimeMillis();
        System.out.println("业务处理时间: " + (endTime - currentTime));
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }
}
