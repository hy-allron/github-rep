package com.allron.javalearn.designmode.单例模式;

/**
 * 静态内部类单例
 * ​这种单例模式可以说是完美的单例模式了
 * <p>
 * 延迟加载(使用的时候才会实例化),避免项目启动内存的消耗
 * 内部类一定是在方法调用之前初始化，巧妙地避免了线程安全问题
 *
 * @author Allron
 * @date 19/8/20
 */
public class LazyInnerClassSingleton {
    // 私有的构造方法
    private LazyInnerClassSingleton() {
    }

    // 公有的获取实例方法
    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY;
    }

    // 静态内部类
    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
