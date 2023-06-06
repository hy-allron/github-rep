package com.allron.javalearn.designmode.建造者模式;

/**
 * 可口可乐
 *
 * @author Allron
 * @date 2020/11/23
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
