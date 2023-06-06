package com.allron.javalearn.nowcoder;


/**
 * 静态代码块、构造代码块、构造函数的执行顺序
 *
 * @author Allron
 * @date 2020/9/7
 */
public class HelloB extends HelloA {

    public String a(int b){
        double a = 11.1;
        Math.round(a);
        return "";
    }

    public int a(int c, String b){
        return 1;
    }


    public HelloB() {
        System.out.println("B");
    }

    {
        System.out.println("I’m B class");
    }

    static {
        System.out.println("static B");
    }

    public static void main(String[] args) {
        new HelloB();
    }
}

class HelloA {
    public HelloA() {
        System.out.println("A");
    }

    {
        System.out.println("I’m A class");
    }

    static {
        System.out.println("static A");
    }
}
