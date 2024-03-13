package com.xiaofei.designpatterns.observer;

/**
 * @Description: Created by IntelliJ IDEA.
 * 抽象观察者(订阅者对象)
 * @Author : 小肥居居头
 * @create 2024/3/13 14:03
 */


public interface Observer {
    void receive(String message);
}
