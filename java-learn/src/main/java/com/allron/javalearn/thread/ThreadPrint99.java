package com.allron.javalearn.thread;

/**
 * 使用99个线程，顺序打印1到99
 * 原址：https://www.toutiao.com/i6740630757317804551/
 *
 * @author Allron
 * @date 2020/11/24
 */
public class ThreadPrint99 {

    private static volatile int totalNum = 0;

    public static void main(String[] args) {
        Object lock = new Object();
        for (int i = 1; i <= 99; i++) {
            //每个线程一个编号
            int num = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        synchronized (lock) {
                            while (totalNum != num) {
                                lock.wait();
                            }
                            System.out.println(Thread.currentThread().getName() + ": " + num);
                            totalNum = totalNum + 1;
                            //通知所有等待线程, 只有满足条件的可以从以上的while返回
                            lock.notifyAll();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }, "thread-" + num).start();
        }
        //主线程启动, 其中totalNum是Volatile修饰，线程可见
        synchronized (lock) {
            totalNum = totalNum + 1;
            lock.notifyAll();
        }
    }
}
