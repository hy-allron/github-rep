package com.allron.javalearn.designmode.装饰器模式;

/**
 * 装饰器抽象类
 *
 * @author allron
 * @date 2023/5/8 12:17
 */
public abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}
