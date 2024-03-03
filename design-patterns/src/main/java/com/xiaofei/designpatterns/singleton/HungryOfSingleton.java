package com.xiaofei.designpatterns.singleton;

public class HungryOfSingleton {
}

/**
 * 类加载器把字节码读取到内存叫类加载,读取到内存之后就需要类初始化;
 * 饿汉式单例,在类加载的时候就完成了实例化;
 */
class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}

/**
 * 饿汉式单例,在类初始化阶段完成的;
 * 两种模式只是初始化时间不同,对内存和性能没有区别;
 */
class HungrySingletonImprove {
    private static HungrySingletonImprove instance;

    private HungrySingletonImprove(){
    }
    static {
        instance = new HungrySingletonImprove();
    }
    public static HungrySingletonImprove getInstance() {
        return instance;
    }
}