package com.allron.javalearn.designmode.工厂模式.工厂方法模式;

/**
 * BMW523工厂
 *
 * @author Allron
 * @date 2020/9/21
 */
public class FactoryBMW523 implements FactoryBMW{
    @Override
    public BMW523 createBMW() {
        return new BMW523();
    }
}
