package com.allron.javalearn.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLockTest
 *
 * @author Allron
 * @date 2020/12/1
 */
public class ReentrantLockTest {

    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
        try {
            save();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
    }

    private static void save(){
        //需要并发
    }
}
