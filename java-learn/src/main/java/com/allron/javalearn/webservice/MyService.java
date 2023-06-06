package com.allron.javalearn.webservice;

/**
 * TODO
 *
 * @author allron
 * @date 2022/6/16 18:11
 */

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * 基于soap协议(http+xml)的服务
 */
@WebService(name = "Login",// 定义Port名称
        serviceName = "MyService", // 修改WebService服务名称
        targetNamespace = "http://com.soft.ws/my" // 定义命名空间，默认为倒置的包名
)
public interface MyService {
    // 提供一个对外公开的服务
    @WebMethod(operationName = "authorization")
    // 修改方法名
    String authorization(@WebParam(name = "userId") String userId,
                         @WebParam(name = "password") String password);
}
