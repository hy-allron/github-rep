package com.allron.javalearn.designmode.责任链模式;

/**
 * @Description TODO
 * @Author hyshizhe
 * @Date 2021/7/12 23:26
 **/
public class HandlerC extends Handler {
    @Override
    String handleRequest(String msg) {
        if(msg.contains("c")){
            msg = msg.replace('c', '*');
        } else if(this.successor != null){
            msg = this.successor.handleRequest(msg);
        }
        return msg;
    }
}
