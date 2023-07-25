package com.allron.javalearn.thread.两线程交替打印;

import java.util.concurrent.locks.LockSupport;

/**
 * 最简单、简洁的写法
 * locksupport支持先调用unpark
 *
 * @author Allron
 * @date 2019/10/08
 **/
public class T08_00_LockSupport {

    private static Thread t1, t2;

    public static void main(String[] args) {
        char[] aI = "1234567".toCharArray();
        char[] aC = "ABCDEFG".toCharArray();


        t1 = new Thread(() -> {
            for (int i = 1; i <= 26; i++) {
                System.out.print(i);
                LockSupport.unpark(t2); // 让t2运行
                LockSupport.park(); // 当前线程阻塞
            }
        });

        t2 = new Thread(() -> {
            for (char c = 'A'; c <= 'Z'; c++) {
                LockSupport.park(); // 先阻塞
                System.out.print(c); // 唤醒后输出
                LockSupport.unpark(t1); // 让t1输出

            }
        });

        t2.start();
        t1.start();
    }
}
