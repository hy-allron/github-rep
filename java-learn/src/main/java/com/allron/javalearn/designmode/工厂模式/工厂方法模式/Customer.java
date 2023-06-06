package com.allron.javalearn.designmode.工厂模式.工厂方法模式;

/**
 * 客户
 *
 * @author Allron
 * @date 2020/9/21
 */
public class Customer {
    public static void main(String[] args) {
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        BMW320 bmw320 = factoryBMW320.createBMW();

        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        BMW523 bmw523 = factoryBMW523.createBMW();
    }
}
