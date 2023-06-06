package com.allron.javalearn.designmode.装饰器模式;

/**
 * 具体的装饰器类1
 *
 * @author allron
 * @date 2023/5/8 12:18
 */
public class ConcreteDecorator1 extends Decorator{
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();
        System.out.println("为组件添加功能1");
    }
}
