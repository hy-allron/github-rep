package com.allron.javalearn.designmode.单例模式;

/**
 * 饿汉式（线程安全-静态内部类）
 *
 * @author Allron
 * @date 2020/9/13
 */
public class SingletonDemo4 {
    private static class SingletonHolder{

        private static SingletonDemo4 instance = new SingletonDemo4();
    }

    private SingletonDemo4(){

    }

    public static SingletonDemo4 getInstance(){
        return SingletonHolder.instance;
    }
}
