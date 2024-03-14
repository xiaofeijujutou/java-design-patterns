package com.xiaofei.framework.beans.factory.support;

import com.xiaofei.framework.beans.BeanDefinition;

/**
 * @Description: Created by IntelliJ IDEA.
 * 注册对象表
 * @Author : 小肥居居头
 * @create 2024/3/14 17:43
 */


public interface BeanDefinitionRegistry {

    //把BeanDefinition对象注册到容器中;
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    //从注册表中删除指定名称的BeanDefinition对象
    void removeBeanDefinition(String beanName) throws Exception;

    //根据名称从注册表中获取BeanDefinition对象
    BeanDefinition getBeanDefinition(String beanName) throws Exception;

    boolean containsBeanDefinition(String beanName);

    int getBeanDefinitionCount();

    String[] getBeanDefinitionNames();

}
