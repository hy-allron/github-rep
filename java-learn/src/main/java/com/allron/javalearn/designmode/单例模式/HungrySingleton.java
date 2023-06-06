package com.allron.javalearn.designmode.单例模式;

/**
 * 饿汉式单列
 * 优点：没有加任何的锁、执行效率比较高，在用户体验上来说，比懒汉式更好。
 * 缺点：类加载的时候就初始化，不管用与不用都占着空间，浪费了内存，有可能占着茅
 *
 * @author Allron
 * @date 19/8/20
 */
public class HungrySingleton {
    //私有的构造函数
    private HungrySingleton() {
    }

    //自己创建自己的实例
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    //向其他对象提供这一实例
    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
