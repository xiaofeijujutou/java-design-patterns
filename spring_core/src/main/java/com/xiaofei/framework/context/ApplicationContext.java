package com.xiaofei.framework.context;

import com.xiaofei.framework.beans.factory.BeanFactory;

/**
 * @Description: Created by IntelliJ IDEA.
 * 定义非延时加载功能,也就是项目一启动就加载所有的类;
 * @Author : 小肥居居头
 * @create 2024/3/14 18:56
 */


public interface ApplicationContext extends BeanFactory {
    void refresh() throws Exception;
}
