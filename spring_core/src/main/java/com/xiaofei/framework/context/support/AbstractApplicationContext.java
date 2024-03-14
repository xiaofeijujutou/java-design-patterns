package com.xiaofei.framework.context.support;

import com.xiaofei.framework.beans.factory.support.BeanDefinitionReader;
import com.xiaofei.framework.beans.factory.support.BeanDefinitionRegistry;
import com.xiaofei.framework.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: Created by IntelliJ IDEA.
 * ApplicationContext接口实现子类,作用是将BeanFactory的懒加载改成立即加载;
 * @Author : 小肥居居头
 * @create 2024/3/14 19:01
 */


public abstract class AbstractApplicationContext implements ApplicationContext {

    /**
     * 依赖了Reader,也就间接依赖了Register;
     */
    protected BeanDefinitionReader beanDefinitionReader;

    /**
     * 单例Bean容器,这个需要三个map,也就是三级缓存;
     */
    protected Map<String, Object> singletonObjects = new HashMap<String, Object>(64);
    /**
     * 配置文件路径
     */
    protected String configLocation;

    /**
     * 将所有Bean初始化;
     * @throws Exception
     */
    public void refresh() throws Exception {
        //Reader获取所有的注册信息存储到了自身对象;
        beanDefinitionReader.loadBeanDefinitions(configLocation);
        finishBeanInitialization();
    }

    private void finishBeanInitialization() throws Exception {
        //从注册表里面读取出注册信息;
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        String[] beanDefinitionNames = registry.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            //beanFactory的方法,调用了get就会去创建;
            getBean(beanDefinitionName);
        }
    }
}
