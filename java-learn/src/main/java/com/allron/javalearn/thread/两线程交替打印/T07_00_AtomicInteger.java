package com.allron.javalearn.thread.两线程交替打印;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Allron
 * @date 2019/10/08
 **/
public class T07_00_AtomicInteger {
    static AtomicInteger threadNo = new AtomicInteger(1);// 1表示1线程运行


    public static void main(String[] args) {
        Thread t1 = new Thread(()->{

            for (int i = 1; i <= 26; i++) {
                while (threadNo.get() !=1) {}
                System.out.print(i);
                threadNo.set(2);
            }
        });

        Thread t2 = new Thread(()->{
            for (char c = 'A'; c <= 'Z'; c++) {
                while (threadNo.get() != 2) {}
                System.out.print(c);
                threadNo.set(1);
            }
        });

        t1.start();
        t2.start();

    }
}
