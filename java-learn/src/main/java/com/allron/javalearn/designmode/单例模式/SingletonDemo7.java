package com.allron.javalearn.designmode.单例模式;

/**
 * 懒汉式（双重校验锁 + volatile）
 *
 * @author Allron
 * @date 2020/9/13
 */
public class SingletonDemo7 {
    private volatile static SingletonDemo7 instance;

    private SingletonDemo7(){}

    public static SingletonDemo7 getInstance(){
        if(instance == null){
            synchronized (SingletonDemo7.class){
                if(instance == null){
                    instance = new SingletonDemo7();
                }
            }
        }
        return instance;
    }
}
