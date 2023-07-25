package com.allron.javalearn.thread;

/**
 * Runnable创建多线程
 *
 * @author Allron
 * @date 2019/09/06
 **/
public class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;

    RunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // 让线程睡眠一会
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

class TestThread {

    public static void main(String args[]) {
        RunnableDemo R1 = new RunnableDemo("Thread-yangjianbo");
        R1.start();

        RunnableDemo R2 = new RunnableDemo("Thread-allron");
        R2.start();
    }
}
