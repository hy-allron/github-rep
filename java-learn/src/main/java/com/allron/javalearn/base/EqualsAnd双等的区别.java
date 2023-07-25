package com.allron.javalearn.base;

/**
 * @author Allron
 * @date 19/7/19
 */
public class EqualsAnd双等的区别 {
    public static void main(String[] args) {
        int a = 128;
        int b = 128;
        //Integer缓存池cache(-128,127)
        Integer c = 128;
        Integer d = 128;
        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(c.equals(d));
    }
}
