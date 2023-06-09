package com.allron.javalearn.thread;

/**
 * Thread实现多线程
 *
 * @author Allron
 * @date 2019/09/06
 **/
public class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;

    ThreadDemo(String name) {
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

    @Override
    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

class ThreadTest {

    public static void main(String args[]) {
        ThreadDemo T1 = new ThreadDemo("Thread-yangjianbo");
        T1.start();

        ThreadDemo T2 = new ThreadDemo("Thread-allron");
        T2.start();
    }
}
