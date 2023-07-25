package com.allron.javalearn.designmode.责任链模式;

/**
 * @Description TODO
 * @Author hyshizhe
 * @Date 2021/7/12 23:26
 **/
public class Client {

    public static void main(String[] args) {
        Handler handlerA = new HandlerA();
        Handler handlerB = new HandlerB();
        Handler handlerC = new HandlerC();

        handlerA.setSuccessor(handlerB);
        handlerB.setSuccessor(handlerC);

        System.out.println(handlerA.handleRequest("apple"));
        System.out.println(handlerA.handleRequest("bicycle"));
        System.out.println(handlerA.handleRequest("color"));
    }
}
