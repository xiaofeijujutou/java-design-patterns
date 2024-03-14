package com.xiaofei.framework.beans.factory;

/**
 * @Description: Created by IntelliJ IDEA.
 * IOC容器父接口;
 * @Author : 小肥居居头
 * @create 2024/3/14 16:27
 */


public interface BeanFactory {

    //根据bean对象的名称获取bean对象
    Object getBean(String name) throws Exception;
    //根据bean对象的名称获取bean对象，并进行类型转换
    <T> T getBean(String name, Class<? extends T> clazz) throws Exception;
}
