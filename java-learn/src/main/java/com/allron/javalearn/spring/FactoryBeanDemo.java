package com.allron.javalearn.spring;

import org.springframework.beans.factory.FactoryBean;

/**
 * 该类是SpringIOC容器是创建Bean的一种形式，这种方式创建Bean会有加成方式，融合了简单的工厂设计模式于装饰器模式
 * * Interface to be implemented by objects used within a {@link BeanFactory} which * are themselves factories for individual objects. If a bean implements this * interface, it is used as a factory for an object to expose, not directly as a * bean instance that will be exposed itself.
 * 有些人就要问了，我直接使用Spring默认方式创建Bean不香么，为啥还要用FactoryBean做啥，在某些情况下，对于实例Bean对象比较复杂的情况下，使用传统方式创建bean会比较复杂，例如（使用xml配置），这样就出现了FactoryBean接口，可以让用户通过实现该接口来自定义该Bean接口的实例化过程。即包装一层，将复杂的初始化过程包装，让调用者无需关系具体实现细节。
 *
 * @author allron
 * @date 2023/5/8 11:58
 */
public class FactoryBeanDemo implements FactoryBean{

    @Override
    public Object getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
