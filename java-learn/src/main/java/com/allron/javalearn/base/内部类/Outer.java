package com.allron.javalearn.base.内部类;

/**
 * TODO
 *
 * @author allron
 * @date 2022/5/26 14:40
 */
public class Outer {

    public int age = 18;
    class Inner {
        public int age = 20;
        public void showAge() {
            int age  = 25;
            System.out.println(age);//空1
            System.out.println(this.age);//空2
            System.out.println(Outer.this.age);//空3
        }
    }
}
