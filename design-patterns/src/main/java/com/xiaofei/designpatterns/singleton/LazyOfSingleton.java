package com.xiaofei.designpatterns.singleton;

public class LazyOfSingleton {
}

/**
 * 懒汉式,需要用的时候才创建;
 * 但是在并发高的时候有可能多次调用构造器,而且由于指令重拍的问题,
 * 可能拿到的是没有实例化好的对象;
 */
class Lazy{
    private static Lazy instance;

    private Lazy(){}

    public static Lazy getInstance() {
        if (instance == null){
            instance = new Lazy();
        }
        return instance;
    }
}

/**
 * 线程安全,但是性能低下;
 */
class LazyThreadSafe{
    private static LazyThreadSafe instance;

    private LazyThreadSafe(){}

    public static synchronized LazyThreadSafe getInstance() {
        if (instance == null){
            instance = new LazyThreadSafe();
        }
        return instance;
    }
}

/**
 * 使用双重检测机制
 */
class LazyDoubleCheck{
    /**
     * 加上volatile的原因:可见性
     * 确保instance创建完之后其他线程能立即从线程中感知到,从而不去重复创建对象;
     */
    private static volatile LazyDoubleCheck instance;

    private LazyDoubleCheck(){}

    public static LazyDoubleCheck getInstance() {
        if (instance == null){
            synchronized (LazyDoubleCheck.class){
                if (instance == null){
                    instance = new LazyDoubleCheck();
                }
            }
        }
        return instance;
    }
}

