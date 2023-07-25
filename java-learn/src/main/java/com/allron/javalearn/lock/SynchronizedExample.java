package com.allron.javalearn.lock;

/**
 * TODO
 *
 * @author allron
 * @date 2023/7/18 16:44
 */
public class SynchronizedExample {
    private static int counter = 0;

    public static void main(String[] args) {
        final SynchronizedExample example = new SynchronizedExample();

        // JDK 1.7中的自适应自旋
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
//                example.incrementCounter();
                counter++;
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
//                example.incrementCounter();
                counter++;
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Counter value: " + counter);
    }

    private /*synchronized*/ void incrementCounter() {
        counter++;
    }
}

