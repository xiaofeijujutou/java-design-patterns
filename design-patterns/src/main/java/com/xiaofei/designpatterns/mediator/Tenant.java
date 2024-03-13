package com.xiaofei.designpatterns.mediator;

/**
 * @Description: Created by IntelliJ IDEA.
 * 租房者
 * @Author : 小肥居居头
 * @create 2024/3/13 15:49
 */


public class Tenant extends Person {

    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * 租房者发需求给中介
     */
    public void sendMessages(String message){
        mediator.communication(this, message);
    }
}
