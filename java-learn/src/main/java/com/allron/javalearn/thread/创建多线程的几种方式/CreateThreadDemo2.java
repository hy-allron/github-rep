package com.allron.javalearn.thread.创建多线程的几种方式;

/**
 * 描述：实现Runnable接口创建线程 <br>
 * 作者：allron <br>
 * 修改日期：2021/11/10 17:36 <br>
 * E-mail: hyshizhe@163.com <br>
 */
public class CreateThreadDemo2 implements Runnable {
    
    @Override
    public void run() {
        System.out.println("当前运行的线程名为： " + Thread.currentThread().getName());
    }

    public static void main(String[] args) throws Exception {
        CreateThreadDemo2 runnable = new CreateThreadDemo2();
        new Thread(runnable, "MyThread1").start();
        new Thread(runnable, "MyThread2").start();
    }
}
