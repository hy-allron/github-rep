package com.allron.javalearn.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 整型原子类
 *
 * @author Allron
 * @date 2020/12/2
 */
public class AtomicIntegerTest {

    private static AtomicInteger atomicInteger = new AtomicInteger();

    private static void increment(){
        //the previous value
        atomicInteger.getAndIncrement();
    }

    private static int get(){
        //the current value
        return atomicInteger.get();
    }

    public static void main(String[] args) {
        increment();
        System.out.println(get());
    }
}
