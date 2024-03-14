package com.xiaofei.springioc.controller;

import com.xiaofei.framework.context.ApplicationContext;
import com.xiaofei.framework.context.support.ClassPathXmlApplicationContext;
import com.xiaofei.springioc.service.UserService;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/14 14:43
 */

public class UserController {
    public static void main(String[] args) throws Exception{
        //使用App来创建Bean:
        ApplicationContext application =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //程序运行到这里,所有的Bean都会被创建;
        UserService userService = application.getBean("userService", UserService.class);
        userService.service();



//        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
//        //程序运行到这里,BeanFactory被创建了,但是Bean还没被创建,只有get发现没有的时候才会去创建;
//        UserService userService1 = beanFactory.getBean("userService", UserService.class);
//        userService1.service();
    }
}
