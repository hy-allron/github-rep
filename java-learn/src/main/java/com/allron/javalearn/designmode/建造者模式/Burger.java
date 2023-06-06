package com.allron.javalearn.designmode.建造者模式;

/**
 * 汉堡
 *
 * @author Allron
 * @date 2020/11/23
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
