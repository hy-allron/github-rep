package com.allron.javalearn.designmode.装饰器模式;

/**
 * 具体的装饰器类2
 *
 * @author allron
 * @date 2023/5/8 12:19
 */
public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();
        System.out.println("为组件添加功能2");
    }
}
