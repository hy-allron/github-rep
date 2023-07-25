package com.allron.javalearn.webservice;

import javax.xml.ws.Endpoint;

/**
 * TODO
 *
 * @author allron
 * @date 2022/6/16 18:14
 */
public class MyPublisher {
    public static void main(String[] args) {
        //指定服务url
        String url = "http://127.0.0.1:12345/myservice";
        //指定服务实现类
        MyService server = new MyServiceImpl();
        //采用命令行发布者Endpoint发布服务
        Endpoint.publish(url, server);
    }
}
