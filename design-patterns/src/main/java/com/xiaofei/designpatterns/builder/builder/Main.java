package com.xiaofei.designpatterns.builder.builder;


import com.xiaofei.designpatterns.builder.builder.braking.BasicBraking;
import com.xiaofei.designpatterns.builder.builder.engine.AdvancedEngine;
import com.xiaofei.designpatterns.builder.builder.tire.IntermediateTire;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/6 20:51
 */


public class Main {
    public static void main(String[] args) {
        Director director = new Director(new CarBuilder());
        //可以写成对应枚举,builder本身就是线程不安全的;
        Car car = (Car)director.construct(new AdvancedEngine(),
                new IntermediateTire(),
                new BasicBraking());
        System.out.println(car);
    }
}
