package com.xiaofei.designpatterns.observer;

/**
 * @Description: Created by IntelliJ IDEA.
 * 抽象主题角色类
 * @Author : 小肥居居头
 * @create 2024/3/13 14:02
 */


public interface Subject {
    /**
     * 添加订阅者
     * @param observer
     */
    void attach(Observer observer);

    /**
     * 删除订阅者;
     * @param observer
     */
    void detach(Observer observer);

    /**
     * 微信小程序给所有订阅者发消息
     * @param message
     */
    void update(String message);
}
