package com.allron.javalearn.designmode.单例模式;

/**
 * 双重检查锁单例
 * 这种单例模式主要解决懒汉式单列的线程不安全的问题,用了synchronized 加锁,所以性能会有所消耗
 *
 * @author Allron
 * @date 19/8/20
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazy = null;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazy == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazy == null) {
                    lazy = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazy;
    }
}
