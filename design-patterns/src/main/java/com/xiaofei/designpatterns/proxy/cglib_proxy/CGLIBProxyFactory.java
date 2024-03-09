package com.xiaofei.designpatterns.proxy.cglib_proxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/8 17:27
 */


public class CGLIBProxyFactory implements MethodInterceptor {
    private TrainStation trainStation = new TrainStation();

    /**
     * 工厂方法:返回代理类的对象;
     * @return
     */
    public TrainStation getProxyObject() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TrainStation.class);
        //设置回调函数;
        enhancer.setCallback(this);
        //创建代理对象;
        //这里创建的对象就是原厂TrainStation类的子类对象;
        TrainStation proxyObject = (TrainStation) enhancer.create();
        return proxyObject;
    }

    /**
     * 方法拦截器,相当于是前置拦截;
     *
     * @param o           是代理对象，调用真实方法要传真实对象，视频没问题
     * @param method      原厂的方法
     * @param methodArgs  用户调用代理对象穿过来的方法
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] methodArgs, MethodProxy methodProxy) throws Throwable {
        //if方法==买票==>执行买票代理;
        if (method.toString().contains("sellTickets")) {
            int count = (int) methodArgs[0] / 3;
            System.out.println("代理商抽成" + count + "元");
            return method.invoke(trainStation, (int) methodArgs[0] - count);
        }
        //if方法==有没有票==>执行查票代理;
        if (method.toString().contains("hasTicket")) {
            Object methodReturn = method.invoke(trainStation, methodArgs);
            System.out.println("总站有票情况: " + methodReturn);
            System.out.println("分站有票情况" + false);
            return false;
        }
        return method.invoke(trainStation, methodArgs);
    }
}
