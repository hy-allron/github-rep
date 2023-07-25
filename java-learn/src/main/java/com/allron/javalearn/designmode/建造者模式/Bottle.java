package com.allron.javalearn.designmode.建造者模式;

/**
 * 瓶装
 *
 * @author Allron
 * @date 2020/11/23
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
