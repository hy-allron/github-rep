package com.allron.javalearn.base.重写;

public class Child extends Parent{

    /**
     * 定义：重写是子类对父类的允许访问的方法实现过程进行重新编写，发生在子类中
     * 1.重写的子方法访问修饰符必须大于等于父方法的访问修饰符
     * 2.如果父方法的返回类型为private则子方法不能重写该父方法
     * 3.返回值要小于等于父类
     * 4.方法名、参数列表必须相同
     * 5.抛出的异常范围要小于等于父类
     * @return
     */
    @Override
    public String say() {
        return super.say();
    }
}
