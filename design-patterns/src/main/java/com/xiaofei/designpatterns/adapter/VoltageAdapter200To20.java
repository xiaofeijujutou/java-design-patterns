package com.xiaofei.designpatterns.adapter;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description: Created by IntelliJ IDEA.
 * 通过聚合来代替继承,实现解耦;
 * @Author : 小肥居居头
 * @create 2024/3/7 20:33
 */
public class VoltageAdapter200To20 implements IVoltage20V {
    @Autowired
    private  Voltage220V voltage220V;

    @Override
    public int outPut20V() {
        int source = voltage220V.outPut220V();
        int destination = source / 11;
        return destination;
    }
}
