package com.allron.javalearn.designmode.建造者模式;

/**
 * 鸡肉汉堡
 *
 * @author Allron
 * @date 2020/11/23
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
