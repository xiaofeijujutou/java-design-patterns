package com.xiaofei.designpatterns.proxy;

import com.xiaofei.designpatterns.proxy.cglib_proxy.CGLIBProxyFactory;
import com.xiaofei.designpatterns.proxy.cglib_proxy.TrainStation;
import com.xiaofei.designpatterns.proxy.jdkproxy.ProxyFactory;
import com.xiaofei.designpatterns.proxy.jdkproxy.SellTickets;
import com.xiaofei.designpatterns.proxy.staticproxy.ProxyPoint;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/8 17:15
 */


public class Main {
    public static void main(String[] args) {
        CGLIBProxyFactory proxyFactory = new CGLIBProxyFactory();
        TrainStation proxyObject = proxyFactory.getProxyObject();
        proxyObject.sellTickets(123);
        System.out.println(proxyObject.hasTicket());

    }

    public static void staticProxy(){
        //静态代理,直接写死;
        ProxyPoint proxyPoint = new ProxyPoint();
        proxyPoint.sellTickets(234);
    }

    public static void JDKProxy(){
        //静态代理,直接写死;
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets proxyObject = proxyFactory.getProxyObject();
        //这里生成的proxyObject对象,其实是$Proxy0对象
        proxyObject.sellTickets(2345);
        System.out.println(proxyObject.getClass());
    }
}
