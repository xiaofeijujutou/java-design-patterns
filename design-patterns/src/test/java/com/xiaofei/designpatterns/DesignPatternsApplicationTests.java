package com.xiaofei.designpatterns;


import org.junit.Test;
import org.springframework.beans.factory.Aware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigBeanDefinitionParser;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Scope
@SpringBootTest
@Service
class DesignPatternsApplicationTests {

    @Test
    void contextLoads() {
        //BeanNameAware
        //Aware
        //BeanPostProcessor
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("");
    }


}
