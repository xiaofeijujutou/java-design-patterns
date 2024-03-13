package com.xiaofei.designpatterns.mediator;


/**
 * @Description: Created by IntelliJ IDEA.
 * 有房子的人
 * @Author : 小肥居居头
 * @create 2024/3/13 15:48
 */


public class HouseOwner extends Person {

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * 房主发需求给中介
     */
    public void sendMessages(String message){
        mediator.communication(this, message);
    }
}
