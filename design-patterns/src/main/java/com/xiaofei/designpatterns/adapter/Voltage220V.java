package com.xiaofei.designpatterns.adapter;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/7 20:01
 */

/**
 * 被适配的类;
 * 类型会有很多种,这里是220v电压,有可能有380v电压;
 */
public class Voltage220V {
    protected static final int VOLTAGE = 220;

    /**
     * 实际作用的方法
     * @return
     */
    public int outPut220V(){
        System.out.println("电压:" + VOLTAGE);
        return VOLTAGE;
    }
}
