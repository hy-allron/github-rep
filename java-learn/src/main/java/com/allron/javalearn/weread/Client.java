package com.allron.javalearn.weread;

/**
 * TODO
 *
 * @author allron
 * @date 2022/6/16 15:33
 */
public class Client {
    public void f(long l) {
        System.out.println("基本类型");
    }

    public void f(Long l) {
        System.out.println("包装类型");
    }

    public static void main(String[] args) {
        Client client = new Client();
        int i = 140;
        client.f(i);
        client.f(Integer.valueOf(i));
    }
}
