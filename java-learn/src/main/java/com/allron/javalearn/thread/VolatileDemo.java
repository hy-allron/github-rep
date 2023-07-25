package com.allron.javalearn.thread;

/**
 * 描述：TODO <br>
 * 作者：allron <br>
 * 修改日期：2021/9/17 17:49 <br>
 * E-mail: hyshizhe@163.com <br>
 */
public class VolatileDemo {
    static  boolean flag = false;

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        new Thread(myThread).start();
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(flag){
                System.out.println("step 2: flag为true，结束轮询");
                break;
            }
        }
    }
    
}

class MyThread implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("step 1: 子线程开始执行");
        VolatileDemo.flag = true;
    }
}
