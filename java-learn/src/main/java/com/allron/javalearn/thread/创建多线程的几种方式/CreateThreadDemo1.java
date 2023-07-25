package com.allron.javalearn.thread.创建多线程的几种方式;

/**
 * 描述：继承Thread类创建线程 <br>
 * 作者：allron <br>
 * 修改日期：2021/11/10 17:27 <br>
 * E-mail: hyshizhe@163.com <br>
 */
public class CreateThreadDemo1 extends Thread {
    
    public CreateThreadDemo1(String name){
        this.setName(name);
    }

    @Override
    public void run() {
        System.out.println("当前运行的线程名为： " + Thread.currentThread().getName());
    }

    public static void main(String[] args) throws Exception {
        // 注意这里，要调用start方法才能启动线程，不能调用run方法
        new CreateThreadDemo1("MyThread1").start();
        new CreateThreadDemo1("MyThread2").start();

    }
}
