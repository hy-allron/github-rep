package com.allron.javalearn.base.字符串;

/**
 * 常量折叠
 * 
 * 常量折叠会把常量表达式的值求出来作为常量嵌在最终生成的代码中，这是 Javac 编译器会对源代码做的极少量优化措施之一(代码优化几乎都在即时编译器中进行)。
 *
 * @author allron
 * @date 2023/6/19 14:45
 */
public class ConstantFolding {

    public static void main(String[] args) {
        int a = 1 + 2;
        System.out.println(a);
    }
}
