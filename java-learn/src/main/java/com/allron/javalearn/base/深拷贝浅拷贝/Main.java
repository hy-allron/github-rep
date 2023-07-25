package com.allron.javalearn.base.深拷贝浅拷贝;

/**
 * @author hyshizhe
 */
public class Main {
    public static void main(String[] args) {
        Major major1 = new Major();
        major1.setMajorId(1);
        major1.setMajorName("foo");
        Major major2 = major1;
        major1.setMajorName("bar");
        major1.setMajorId(2);
        System.out.println(major1 == major2);
        System.out.println(major1);
        System.out.println(major2);
    }
}
