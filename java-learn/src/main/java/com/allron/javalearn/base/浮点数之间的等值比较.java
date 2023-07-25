package com.allron.javalearn.base;

import com.allron.javalearn.base.字符串.String认识;

import java.math.BigDecimal;

/**
 * @author Allron
 * @date 19/7/21
 */
public class 浮点数之间的等值比较 {
    public static void main(String认识[] args) {
        //方法一(推荐):使用BigDecimal
        BigDecimal a = new BigDecimal("1.0");
        BigDecimal b = new BigDecimal("0.9");
        BigDecimal c = new BigDecimal("0.8");
        BigDecimal d = a.subtract(b);
        BigDecimal e = b.subtract(c);
        if (d.equals(e)) {
            System.out.println("true");
        }

        //方法二指定误差范围
        float f = 1.0f - 0.9f;
        float g = 0.9f - 0.8f;
        float diff = 1e-6f;
        if (Math.abs(f - g) < diff) {
            System.out.println("true");
        }
    }
}
