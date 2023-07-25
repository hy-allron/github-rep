package com.allron.javalearn.thread;

/**
 * 认识线程死锁
 *
 * @author Allron
 * @date 2020/9/14
 */
public class 死锁 {
    private static Object resource1 = new Object();
    private static Object resource2 = new Object();

    public static void main(String[] args) {
        new Thread(()->{
            synchronized (resource1){
                System.out.println(Thread.currentThread() + "get resource1");
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "waiting get resource2");
                synchronized (resource2) {
                    System.out.println(Thread.currentThread() + "get resource2");
                }
            }
        },"线程 1").start();

        //resource1和resource2互换即可破坏循环等待条件，避免死锁
        new Thread(()->{
            synchronized (resource2){
                System.out.println(Thread.currentThread() + "get resource2");
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "waiting get resource1");
                synchronized (resource1) {
                    System.out.println(Thread.currentThread() + "get resource1");
                }
            }
        },"线程 2").start();
    }
}
