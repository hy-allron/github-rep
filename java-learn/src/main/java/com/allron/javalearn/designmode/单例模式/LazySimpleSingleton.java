package com.allron.javalearn.designmode.单例模式;

/**
 * 懒汉式单列
 * 懒汉式单列是线程不安全的
 *
 * @author Allron
 * @date 19/8/20
 */
public class LazySimpleSingleton {
    //私有的构造函数
    private LazySimpleSingleton() {
    }

    private static LazySimpleSingleton lazy = null;

    //实例化对象并提供这一实例
    public static LazySimpleSingleton getInstance() {
        if (lazy == null) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}
