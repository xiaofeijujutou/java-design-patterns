package com.xiaofei.designpatterns.observer;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/13 14:11
 */


public class ObserverB implements Observer{
    private static String name = "小肥2号";

    @Override
    public void receive(String message) {
        System.out.println(name + " 接收到消息: " + message);
    }
}
