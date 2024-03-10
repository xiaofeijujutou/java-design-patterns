package com.xiaofei.designpatterns.facade;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/10 19:31
 */


public class Light {
    public void lightOn(){
        System.out.println("打开电灯");
    }

    public void lightOff(){
        System.out.println("关闭电灯");
    }
}
