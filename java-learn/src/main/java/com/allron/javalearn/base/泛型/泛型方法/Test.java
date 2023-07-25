package com.allron.javalearn.base.泛型.泛型方法;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 描述：<br>
 * 作者：yangjianbo <br>
 * 修改日期：2021/8/10 10:30 <br>
 * E-mail: yangjianbo@sinosoft.com.cn <br>
 */
public class Test {
    private static <T> String printStr(@NotNull T t){
        if(t instanceof A){
            System.out.println("A class");
        }else if(t instanceof B){
            System.out.println("B class");
        }
        return t.toString();
    }

    public static void main(String[] args) {
        B a = new B();
        a.setId(1);
        a.setName("小明");
        System.out.println(printStr(a));
    }

    @Data
    static
    class A {
        private Integer id;
        private String name;
    }

    @Data
    static
    class B {
        private Integer id;
        private String name;
    }
}
