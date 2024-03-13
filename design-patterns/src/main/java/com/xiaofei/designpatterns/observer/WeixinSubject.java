package com.xiaofei.designpatterns.observer;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: Created by IntelliJ IDEA.
 * 小肥公众号
 * @Author : 小肥居居头
 * @create 2024/3/13 14:06
 */


public class WeixinSubject implements Subject {

    /**
     * 订阅者
     */
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void update(String message) {
        if (!CollectionUtils.isEmpty(observers)){
            for (Observer o : observers) {
                o.receive(message);
            }
        }
    }
}
