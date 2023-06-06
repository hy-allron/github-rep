package com.allron.javalearn.designmode.装饰器模式;

/**
 * TODO
 *
 * @author allron
 * @date 2023/5/8 12:16
 */
public class ConcreteComponent  implements Component {
    @Override
    public void operation() {
        System.out.println("具体组件的操作");
    }
}
