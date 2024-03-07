package com.xiaofei.designpatterns.adapter;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/7 20:15
 */


public class Phone {
    public void charging(IVoltage5V iVoltage5V){
        if (iVoltage5V.outPut5V() == 5){
            System.out.println("可以充电电压为5v");
        }else {
            System.out.println("拒绝充电");
        }
    }
}
