package com.allron.javalearn.atomic;

/**
 * TODO
 *
 * @author allron
 * @date 2022/4/21 12:16
 */


public class VolatileTestObj {
    private String value = null;
    private boolean hasNewValue = false;

    public void put(String value) {
        while (hasNewValue) { // 等待，防止重复赋值
            System.out.println("写等待");
        }
        this.value = value;
        hasNewValue = true;
    }

    public String get() {
        while (!hasNewValue) { // 等待，防止获取到旧值 
            System.out.println("读等待");
        }
        String value = this.value;
        hasNewValue = false;
        return value;
    }

}



