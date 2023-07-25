package com.allron.javalearn.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * TODO
 *
 * @author allron
 * @date 2022/11/21 11:39
 */
public class CountDownLatchTest {
    //线程数量
    static int num = 100;
    //定义同步辅助工具，主线程等待所有子线程执行完毕
    private static CountDownLatch countDownLatch = new CountDownLatch(num);

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            int finalI = i;
            new Thread() {
                public void run(){
                    if (finalI < 10) {
                        try {
                            System.out.println("当前线程name：" + Thread.currentThread().getName() + "休眠中");
                            Thread.sleep(10 * 1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        System.out.println("当前线程name：" + Thread.currentThread().getName() + "未休眠");
                    }
                    countDownLatch.countDown();
                }
            }.start();
        }
        countDownLatch.await(5, TimeUnit.SECONDS);
        System.out.println("耗时：" + (System.currentTimeMillis() - start)/1000);
    }
}
