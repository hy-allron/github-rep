package com.allron.javalearn.designmode.单例模式;

/**
 * threadlocal
 *
 * @author Allron
 * @date 2020/9/13
 */
public class SingletonDemo8 {
    private static final ThreadLocal<SingletonDemo8> tl = new ThreadLocal<SingletonDemo8>(){
        @Override
        protected SingletonDemo8 initialValue() {
            return new SingletonDemo8();
        }
    };

    private SingletonDemo8(){}

    public static SingletonDemo8 getInstance(){
        return tl.get();
    }
}
