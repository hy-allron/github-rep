package com.allron.javalearn.designmode.工厂模式.简单工厂模式;

/**
 * 客户
 *
 * @author Allron
 * @date 2020/9/21
 */
public class Customer {
    public static void main(String[] args) {
        Factory factory = new Factory();
        BMW bmw320 = factory.createBMW(320);
        BMW bmw523 = factory.createBMW(523);
    }
}
