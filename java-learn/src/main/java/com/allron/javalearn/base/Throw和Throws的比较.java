package com.allron.javalearn.base;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Throw和Throws的比较 {
    public static void main(String[] args) {
        A a = new A();
        try {
            a.sayHello(false);
            log.info("a");
        } catch (Exception e) {
            log.error("捕获异常不再往上抛");
            e.printStackTrace();
        }
        log.info("b");
    }
}
@Slf4j
class A {
    public String sayHello(boolean value) throws Exception {
        if (value) {

            return "你好";
        }
        try {
            throw new NullPointerException();

        } catch (Exception e) {
            log.error("哈哈哈哈哈");
            e.printStackTrace();
        }
        return "不好";
    }
}

