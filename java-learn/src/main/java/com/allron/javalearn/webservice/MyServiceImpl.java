package com.allron.javalearn.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * TODO
 *
 * @author allron
 * @date 2022/6/16 18:12
 */
@WebService(endpointInterface = "com.allron.javalearn.webservice.MyService",
        name = "Login",// 定义Port名称
        serviceName = "MyService", // 修改WebService服务名称
        targetNamespace = "http://com.soft.ws/my" // 定义命名空间，默认为倒置的包名
//服务实现类和接口的注解要一样全
)
public class MyServiceImpl implements MyService{
    @WebMethod(operationName = "authorization" // 修改方法名
    )
    @Override
    public String authorization(@WebParam(name = "userId") String userId,
                                @WebParam(name = "password") String password) {
        if ("admin".equals(userId) && "123456".equals(password)) {
            System.out.println("success");
            return "success";
        }
        System.out.println("error");
        return "error";
    }
}
