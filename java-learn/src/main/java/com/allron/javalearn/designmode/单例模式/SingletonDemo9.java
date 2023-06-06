package com.allron.javalearn.designmode.单例模式;

import java.util.concurrent.atomic.AtomicReference;

/**
 * CAS 锁
 *
 * @author Allron
 * @date 2020/9/13
 */
public class SingletonDemo9 {

    private static final AtomicReference<SingletonDemo9> INSTANCE = new AtomicReference<>();

    private SingletonDemo9(){}

    public static final SingletonDemo9 getInstance(){
        for(;;){
            SingletonDemo9 current = INSTANCE.get();
            if(current != null){
                return current;
            }
            current = new SingletonDemo9();
            if(INSTANCE.compareAndSet(null, current)){
                return current;
            }
        }
    }

    public static void main(String[] args) {
        SingletonDemo9 instance1 = SingletonDemo9.getInstance();
        SingletonDemo9 instance2 = SingletonDemo9.getInstance();
        System.out.println(instance1 == instance2);
    }
}
