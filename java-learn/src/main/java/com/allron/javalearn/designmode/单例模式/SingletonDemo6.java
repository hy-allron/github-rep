package com.allron.javalearn.designmode.单例模式;

/**
 * 懒汉式（双重校验锁）
 *
 * @author Allron
 * @date 2020/9/13
 */
public class SingletonDemo6 {
    private static SingletonDemo6 instance;

    private SingletonDemo6() {
    }

    public static SingletonDemo6 getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo6.class) {
                if (instance == null) {
                    instance = new SingletonDemo6();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(SingletonDemo6.getInstance());
            }).start();
        }
    }
}
