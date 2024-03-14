package com.xiaofei.framework.beans.factory.support;

/**
 * @Description: Created by IntelliJ IDEA.
 * 功能:给一个文件路径或者项目路径,读取Bean定义的配置文件,
 * 然后封装成BeanDefinitionRegistry注册列表;
 * 子类需要持有BeanDefinitionRegistry注册列表;
 * @Author : 小肥居居头
 * @create 2024/3/14 18:16
 */


public interface BeanDefinitionReader {
    //获取注册表对象
    BeanDefinitionRegistry getRegistry();

    /**
     * 给一个xml文件地址,然后解析xml读取bean,然后封装到BeanDefinition中去;
     * @param configLocation
     * @throws Exception
     */
    void loadBeanDefinitions(String configLocation) throws Exception;
}
