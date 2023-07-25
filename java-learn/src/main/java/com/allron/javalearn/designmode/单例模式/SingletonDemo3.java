package com.allron.javalearn.designmode.单例模式;

/**
 * 饿汉式（线程安全）
 *
 * @author Allron
 * @date 2020/9/13
 */
public class SingletonDemo3 {
    private static SingletonDemo3 instance = new SingletonDemo3();

    private SingletonDemo3(){}

    public static SingletonDemo3 getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(SingletonDemo3.getInstance());
    }
}
