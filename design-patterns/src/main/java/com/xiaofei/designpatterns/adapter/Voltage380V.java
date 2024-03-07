package com.xiaofei.designpatterns.adapter;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/7 20:01
 */

/**
 * 被适配的类;
 * 380v工业电压;
 */
public class Voltage380V {
    protected static final int VOLTAGE = 380;

    /**
     * 实际作用的方法
     * @return
     */
    public int outPut380V(){
        System.out.println("电压:" + VOLTAGE);
        return VOLTAGE;
    }
}
