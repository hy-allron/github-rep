package com.allron.javalearn.designmode.建造者模式;

/**
 * 蔬菜汉堡
 *
 * @author Allron
 * @date 2020/11/23
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
