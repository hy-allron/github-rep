package com.allron.javalearn.designmode.工厂模式.抽象工厂模式;

/**
 * ***
 *
 * @author Allron
 * @date 2020/9/21
 */
public class FactoryBMW523 implements AbstractFactory {

    @Override
    public Engine createEngine() {
        return new EngineB();
    }
    @Override
    public Aircondition createAircondition() {
        return new AirconditionB();
    }


}
