package com.xiaofei.designpatterns;

import com.xiaofei.designpatterns.ztest.AAA;
import com.xiaofei.designpatterns.ztest.BBB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.SingletonBeanRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultSingletonBeanRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.objenesis.instantiator.util.UnsafeUtils;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;
import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.rmi.registry.Registry;
import java.util.HashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;

@SpringBootApplication
public class DesignPatternsApplication {
    @Autowired
    private static TransactionTemplate transactionTemplate;
    public static void main(String[] args) throws Exception {

        transactionTemplate.execute(new TransactionCallback() {
            @Override
            public Object doInTransaction(TransactionStatus transactionStatus) {
                transactionStatus.isRollbackOnly();//回滚
                return null;
            }
        });

        //BeanDefinition
//        DefaultSingletonBeanRegistry
//        AbstractApplicationContext
        //ThreadLocal
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DesignPatternsApplication.class);
//        AAA aaa = (AAA)applicationContext.getBean("aaa");
//        System.out.println(aaa);
//        AbstractQueuedSynchronizer
        //SpringApplication.run(DesignPatternsApplication.class, args);
//        ReentrantLock
//        Unsafe unsafe = Unsafe.getUnsafe();
//        Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
        //BlockingQueue
        //Executor //不推荐
//        new ThreadPoolExecutor() //推荐
        //ThreadLocal

    }

}
