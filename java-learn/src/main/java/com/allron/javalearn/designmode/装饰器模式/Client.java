package com.allron.javalearn.designmode.装饰器模式;

/**
 * 测试客户端
 *
 * @author allron
 * @date 2023/5/8 12:20
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        // 对组件进行装饰
        Component decorator1 = new ConcreteDecorator1(component);
        Component decorator2 = new ConcreteDecorator2(decorator1);
        // 最终执行结果包含了被装饰的操作和新增的两个功能
        decorator2.operation();
    }
}
