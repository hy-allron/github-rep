package com.allron.javalearn.lock;

/**
 * 使用 wait/notify 顺序打印ABC
 *
 * @author allron
 * @date 2023/7/19 17:43
 */

public class PrintABCUsingWaitNotify {

    private int state;
    private final int times;
    private static final Object LOCK = new Object();

    public PrintABCUsingWaitNotify(int times) {
        this.times = times;
    }

    private void printLetter(String name, int targetState) {
        for (int i = 0; i < times; i++)
            synchronized (LOCK) {
                while (state % 3 != targetState) {
                    try {
                        LOCK.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                state++;
                System.out.print(name);
                LOCK.notifyAll();
            }
    }

    public static void main(String[] args) {

        PrintABCUsingWaitNotify printABC = new PrintABCUsingWaitNotify(10);
        new Thread(() -> {
            printABC.printLetter("A", 0);
        }, "A").start();
        new Thread(() -> {
            printABC.printLetter("B", 1);
        }, "B").start();
        new Thread(() -> {
            printABC.printLetter("C", 2);
        }, "C").start();
        
    }

}

