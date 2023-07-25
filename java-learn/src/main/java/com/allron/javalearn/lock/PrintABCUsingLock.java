package com.allron.javalearn.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用Lock顺序打印ABC
 *
 * @author allron
 * @date 2023/7/18 17:31
 */
public class PrintABCUsingLock {

    private final int times; // 控制打印次数
    private int state;   // 当前状态值：保证三个线程之间交替打印
    private final Lock lock = new ReentrantLock();

    public PrintABCUsingLock(int times) {
        this.times = times;
    }

    private void printLetter(String name, int targetNum) {
        for (int i = 0; i  < times;){
            lock.lock();
            if (state % 3 == targetNum) {
                state++;
                i++;
                System.out.print(name);
            }
            lock.unlock();
        }
    }

    public static void main(String[] args) {

        //顺序打印10次
        final PrintABCUsingLock loopThread = new PrintABCUsingLock(3);

        new Thread(() -> {
            loopThread.printLetter("A", 0);
        }, "A").start();

        new Thread(() -> {
            loopThread.printLetter("B", 1);
        }, "B").start();

        new Thread(() -> {
            loopThread.printLetter("C", 2);
        }, "C").start();
        
    }

}


