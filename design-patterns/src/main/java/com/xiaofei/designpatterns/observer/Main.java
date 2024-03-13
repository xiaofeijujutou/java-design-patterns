package com.xiaofei.designpatterns.observer;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/13 14:01
 */


public class Main {
    public static void main(String[] args) {
        Subject subject = new WeixinSubject();
        subject.attach(new ObserverA());
        subject.attach(new ObserverB());
        subject.attach(new ObserverC());
        subject.update("小肥商城即将上线");
    }
}
