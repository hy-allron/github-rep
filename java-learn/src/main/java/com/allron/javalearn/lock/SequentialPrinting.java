package com.allron.javalearn.lock;

/**
 * TODO
 *
 * @author allron
 * @date 2023/7/18 17:23
 */
public class SequentialPrinting implements Runnable {
    private static final Object lock = new Object();
    private static int counter = 1;
    private final int threadId;
    private final int totalThreads;
    private final int totalNumbers;

    public SequentialPrinting(int threadId, int totalThreads, int totalNumbers) {
        this.threadId = threadId;
        this.totalThreads = totalThreads;
        this.totalNumbers = totalNumbers;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                while (counter <= totalNumbers) {
                    while (counter % totalThreads != threadId) {
                        lock.wait();
                    }
                    if (counter > totalNumbers) {
                        break;
                    }
                    System.out.println("Thread " + threadId + ": " + counter);
                    counter++;
                    lock.notifyAll();
                }
                // 增加以下代码以确保所有线程结束后唤醒等待的线程
                if (counter > totalNumbers) {
                    lock.notifyAll();
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        int totalThreads = 3;  // 设置线程总数
        int totalNumbers = 10; // 设置要打印的总数字

        Thread[] threads = new Thread[totalThreads];

        for (int i = 0; i < totalThreads; i++) {
            threads[i] = new Thread(new SequentialPrinting(i, totalThreads, totalNumbers));
            threads[i].start();
        }

        try {
            for (Thread thread : threads) {
                thread.join(); // 等待所有线程完成
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

