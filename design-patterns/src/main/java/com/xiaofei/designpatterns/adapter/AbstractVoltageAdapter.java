package com.xiaofei.designpatterns.adapter;

/**
 * @Description: Created by IntelliJ IDEA.
 * 抽象类和空实现;
 * @Author : 小肥居居头
 * @create 2024/3/7 20:53
 */


public class AbstractVoltageAdapter implements IVoltage5V, IVoltage20V {
    @Override
    public int outPut20V() {
        return 0;
    }

    @Override
    public int outPut5V() {
        return 0;
    }
}
