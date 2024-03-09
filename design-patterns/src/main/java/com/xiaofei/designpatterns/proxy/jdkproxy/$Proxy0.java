package com.xiaofei.designpatterns.proxy.jdkproxy;

/**
 * @Description: Created by IntelliJ IDEA.
 * 静态代理是自己写一个原厂类,然后写一个静态代理类,用户直接调用静态代理类,间接调用原厂类;
 * 动态代理:
 *      使用JDK的Proxy工厂,配合上用户自定义代理类的行为,就可以动态生成一个代理类;
 * @Author : 小肥居居头
 * @create 2024/3/8 19:29
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

public final class $Proxy0 extends Proxy implements SellTickets {
    private static Method m3;

    public $Proxy0(InvocationHandler invocationHandler) {
        super(invocationHandler);
    }

    static {
        try {
            m3 = Class.forName("com.xiaofei.designpatterns.proxy.jdkproxy.SellTickets").getMethod("sellTickets", Integer.TYPE);
        }
        catch (Exception classNotFoundException) {
            throw new NoClassDefFoundError(classNotFoundException.getMessage());
        }
    }

    /**
     * 原厂类被代理的方法;
     * @param n
     */
    public final void sellTickets(int n) {
        try {
            //这里的h就是Proxy里面的属性InvocationHandler
            //InvocationHandler.invoke就是我们自定义实现类,需要干什么开发的时候写好行为;
            //如果代理方法有返回值,那么sellTickets这个方法就有返回值,下面的return也就会返回方法的返回值
            this.h.invoke(this, m3, new Object[]{n});
            return;
        }
        catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }
}
//@Override
//public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//    //代理商需要处理的方法;
//    int count = (int)args[0] / 3;
//    System.out.println("代理商抽成" + count + "元");
//    //实际总部的方法
//    Object invoke = method.invoke(trainStation, (int)args[0] - count);
//    return invoke;
//}