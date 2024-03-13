package com.xiaofei.designpatterns.mediator;

/**
 * @Description: Created by IntelliJ IDEA.
 * 抽象中介者
 * @Author : 小肥居居头
 * @create 2024/3/13 14:48
 */


public abstract class Mediator {

    public abstract void communication(Person person, String message);
}
