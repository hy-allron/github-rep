package com.allron.javalearn.designmode.责任链模式;

/**
 * @Description 统一抽象类
 * @Author hyshizhe
 * @Date 2021/7/12 23:22
 **/
public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    abstract String handleRequest(String msg);
}
