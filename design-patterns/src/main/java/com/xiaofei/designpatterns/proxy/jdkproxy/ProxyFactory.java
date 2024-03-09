package com.xiaofei.designpatterns.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.function.Function;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/8 17:27
 */


public class ProxyFactory {
    TrainStation trainStation = new TrainStation();

    public SellTickets getProxyObject() {
        // ClassLoader loader 类加载器,代理类是程序运行时动态生成的类,可以通过目标对象获取类加载器;
        // Class<?>[] interfaces 被代理对象实现的接口的字节码对象;
        // InvocationHandler h 代理对象的调用处理程序
        // Proxy.newProxyInstance(InvocationHandler h) 相当于是一个工厂,往里面添加行为,就能创建一个代理类;
        SellTickets sellTicketsProxy = (SellTickets)Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                //这里是提供接口,接口里面有方法,需要代理什么方法就往里面填什么接口;
                //如果需要代理多个方法用不同代理方式,就采用接口隔离;
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     *
                     * @param proxy 这个对象和上面的sellTicketsProxy是同一个对象,在invoke方法中基本不用;
                     * @param method 对接口中的方法进行封装的method对象,也就是接口的抽象方法;
                     *               如果接口有多个抽象方法,那么用户端调哪个方法实际就调用接口的方法;
                     * @param args 用户端调用发送的实际参数;
                     * @return 抽象接口的返回值;
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //代理商需要处理的方法;
                        int count = (int)args[0] / 3;
                        System.out.println("代理商抽成" + count + "元");
                        //method是接口抽象方法,抽象方法需要指定具体实现才能调用,这里指定原厂trainStation
                        Object invoke = method.invoke(trainStation, (int)args[0] - count);
                        return invoke;
                    }
                }
        );
        return sellTicketsProxy;
    }

}
