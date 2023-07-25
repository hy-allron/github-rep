package com.allron.javalearn.designmode.单例模式;

/**
 * 懒汉式（线程安全-简单粗暴）
 *
 * @author Allron
 * @date 2020/9/13
 */
public class SingletonDemo2 {
    private static SingletonDemo2 instance;

    private SingletonDemo2() {
    }

    public static synchronized SingletonDemo2 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo2();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonDemo2 singletonDemo2 = SingletonDemo2.getInstance();
    }
}
