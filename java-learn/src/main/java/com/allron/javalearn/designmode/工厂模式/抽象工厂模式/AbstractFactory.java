package com.allron.javalearn.designmode.工厂模式.抽象工厂模式;

/**
 * ***
 *
 * @author Allron
 * @date 2020/9/21
 */
public interface AbstractFactory {
    //制造发动机
    public Engine createEngine();
    //制造空调
    public Aircondition createAircondition();
}
