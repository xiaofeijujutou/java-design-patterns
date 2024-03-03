package com.xiaofei.designpatterns.singleton;

class StaticClassOfSingleton{

}

/**
 * 静态内部类单例模式
 * 当外部类被加载到内存的时候,静态内部类不会被装载;
 * 在调用静态方法getInstance的时候静态内部类才会被装载;
 * 装载的时候完成单例初始化
 */
class Singleton{
    /**
     * 私有化构造器
     */
    private Singleton() {}

    /**
     * 单例实例由一个静态内部类保存
     */
    private static class SingletonInstance {
        private static final Singleton instance = new Singleton();
    }

    /**
     * 想获取单例实例,就从静态内部类获取
     * @return
     */
    public static Singleton getInstance() {
        return SingletonInstance.instance;
    }
}