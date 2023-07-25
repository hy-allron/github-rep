package com.allron.javalearn.base.多态;

/**
 * 多态：
 * 是指程序中定义的引用变量所指向的具体类型和通过该引用变量发出的方法调用在编程时并不确定，而是在程序运行时期才确定，
 * 即一个引用变量到底会指向哪个类的实例对象，该引用变量发出的方法调用到底是哪个类中实现的方法，必须在程序运行时期才能决定
 *
 * 实现多态的两种方式：
 * 1.继承（多个子类对同一个方法的重写）
 * 2.接口（实现接口并覆盖接口中同一方法）
 *
 * @author Allron
 * @date 2020/6/16
 */
public class 多态 {

    interface 接口 {
        String say();
    }

    class 类 implements 接口{

        @Override
        public String say(){
            return "hello";
        }
    }

    class Child extends 类{

        @Override
        public String say(){
            return "hello world";
        }
    }
}
