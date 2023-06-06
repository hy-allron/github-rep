package com.allron.javalearn.designmode.工厂模式.抽象工厂模式;

/**
 * ***
 *
 * @author Allron
 * @date 2020/9/21
 */
public class FactoryBMW320 implements AbstractFactory{

    @Override
    public Engine createEngine() {
        return new EngineA();
    }
    @Override
    public Aircondition createAircondition() {
        return new AirconditionA();
    }
}
