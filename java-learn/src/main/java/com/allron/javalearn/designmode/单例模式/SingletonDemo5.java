package com.allron.javalearn.designmode.单例模式;

/**
 * 高级单例模式写法：枚举
 *
 * @author Allron
 * @date 2020/9/13
 */
public enum SingletonDemo5 {
    INSTANCE;
}

class Demo{
    public static void main(String[] args) {
        SingletonDemo5 singletonDemo5 = SingletonDemo5.INSTANCE;
        System.out.println(singletonDemo5);
    }
}
