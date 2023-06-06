package com.allron.javalearn.base.重载;

/**
 * 重载：
 * 发生在同一个类中，方法名相同，参数类型不同、个数不同、顺序不同，方法的返回值和访问修饰符可以不同
 */
public class OverLoading {

    public String say(){
        return "hello";
    }

    public String say(String content){
        return content;
    }

    /**
     * 不能有两个名字相同、参数类型也相同但返回类型不同的方法
     */
    /*public String eat(){
        return "吃饭";
    }

    public int eat(){
        return 0;
    }*/
}
