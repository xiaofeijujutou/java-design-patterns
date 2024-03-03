package com.xiaofei.designpatterns.singleton;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class EnumOfSingleton {
    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.INSTANCE;
    }
}

/**
 * 使用枚举来实现单例,最上面是单例对象,下面是单例对象所拥有的属性,
 * 也就是平常一个类有什么属性;
 * 使用单例可以阻挡反射;
 * 缺点:饿汉式加载,消耗内存;
 */
enum EnumSingleton{
    INSTANCE;
    Field field1;
    Field field2;
    Method method1;
    Method method2;
}
