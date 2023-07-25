package com.allron.javalearn.atomic;

/**
 * TODO
 *
 * @author allron
 * @date 2022/4/21 12:21
 */
public class VolatileTest {
    public static void main(String... args) {
        VolatileTestObj obj = new VolatileTestObj();
        new Thread(() -> {
            while (true) {
                obj.put("time：" + System.currentTimeMillis());
            }
        }, "WriteThread").start();
        new Thread(() -> {
            while (true) {
                System.out.println(obj.get());
            }
        }, "ReadThread").start();
    }
}
