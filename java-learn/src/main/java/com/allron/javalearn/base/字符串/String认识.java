package com.allron.javalearn.base.字符串;

/**
 * 字符串：
 * 提问：为什么String是不可变的？
 * 回答：String类中使用final关键字修饰字符数组来保存字符串，
 * private final char value[]，所以String对象是不可变的。
 * (在Java9之后，String类的实现改成用byte数组存储字符串 private final byte[] value)
 */
public class String认识 {

    public static void main(String[] args) throws IllegalAccessException {
        byte[] str = new byte[5];
        str[0] = 'h';
        str[1] = 'e';
        str[2] = 'l';
        str[3] = 'l';
        str[4] = 'o';
        for (byte by:str
             ) {
            System.out.print(by);
        }
        System.out.println(str[0]);
        byte a = '1';
        System.out.println(a);
    }
}
