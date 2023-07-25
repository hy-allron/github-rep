package com.allron.javalearn.base.反射;

/**
 * TODO
 *
 * @author allron
 * @date 2023/7/10 14:55
 */
public class TargetObject {
    private String value;

    public TargetObject() {
        value = "JavaGuide";
    }

    public void publicMethod(String s) {
        System.out.println("I love " + s);
    }

    private void privateMethod() {
        System.out.println("value is " + value);
    }
}
