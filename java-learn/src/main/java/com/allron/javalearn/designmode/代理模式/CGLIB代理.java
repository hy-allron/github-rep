package com.allron.javalearn.designmode.代理模式;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 类没有实现任何接口可以使用cglib代理
 *
 * @author Allron
 * @date 19/8/29
 */
public class CGLIB代理 {
    public static void main(String[] args) {
        UserClass userClass=new UserClass();
        CglibProxyFactory cglibProxyFactory=new CglibProxyFactory(userClass);
        UserClass userClassProxy=(UserClass) cglibProxyFactory.getProxyInstance();
        userClassProxy.save();
    }
}

/**
 * 目标对象,没有实现任何接口
 */
class UserClass {

    public void save() {
        System.out.println("----已经保存数据!----");
    }
}

/**
 * Cglib子类代理工厂
 * 对UserDao在内存中动态构建一个子类对象
 */
class CglibProxyFactory implements MethodInterceptor {
    //维护目标对象
    private Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    //给目标对象创建一个代理对象
    public Object getProxyInstance(){
        //1.工具类
        Enhancer en = new Enhancer();
        //2.设置父类
        en.setSuperclass(target.getClass());
        //3.设置回调函数
        en.setCallback(this);
        //4.创建子类(代理对象)
        return en.create();

    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("开始事务...");

        //执行目标对象的方法
        Object returnValue = method.invoke(target, args);

        System.out.println("提交事务...");

        return returnValue;
    }
}
