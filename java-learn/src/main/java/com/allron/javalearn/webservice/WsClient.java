package com.allron.javalearn.webservice;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

/**
 * 参考文档：https://blog.csdn.net/linjinhuo/article/details/78777694
 *
 * @author allron
 * @date 2022/6/16 18:15
 */
public class WsClient {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://127.0.0.1:12345/myservice?wsdl");
        // 指定命名空间和服务名称
        QName qName = new QName("http://com.soft.ws/my", "MyService");
        Service service = Service.create(url, qName);
        // 通过getPort方法返回指定接口
        MyService myServer = service.getPort(new QName("http://com.soft.ws/my",
                "LoginPort"), MyService.class);
        // 调用方法 获取返回值
        String result = myServer.authorization("admin", "1234561");
        System.out.println(result);
    }
}
