package com.allron.javalearn.designmode.工厂模式.工厂方法模式;

/**
 * BMW320工厂
 *
 * @author Allron
 * @date 2020/9/21
 */
public class FactoryBMW320 implements FactoryBMW{
    @Override
    public BMW320 createBMW() {
        return new BMW320();
    }
}
