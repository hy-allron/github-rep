package com.allron.javalearn.lock;

/**
 * TODO
 *
 * @author allron
 * @date 2023/7/18 17:16
 */
public class PrintInOrder {
    private int count = 1;

    /*private void print(String name) {
        synchronized(this) {
            while(count % 3 != 1) {
                try {
                    wait();
                } catch (InterruptedException e) {}
            }
            System.out.println(name);
            count++;
            notify();
        }
    }*/

    private synchronized void print(String name) {
        System.out.println(name);
        count++;
        notify();

        while(count % 3 != 1) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) {
        PrintInOrder print = new PrintInOrder();

        new Thread(() -> {
            for(int i=0; i<10; i++) {
                print.print("A");
            }
        }).start();

        new Thread(() -> {
            for(int i=0; i<10; i++) {
                print.print("B");
            }
        }).start();

        new Thread(() -> {
            for(int i=0; i<10; i++) {
                print.print("C");
            }
        }).start();
    }
}
