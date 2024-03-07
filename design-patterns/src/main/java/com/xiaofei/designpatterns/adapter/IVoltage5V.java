package com.xiaofei.designpatterns.adapter;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/7 20:04
 */

/**
 * 适配接口;
 * 这个就是可以使用的规范,必须要实现这个规范才能给5v手机使用;
 */
public interface IVoltage5V {

    /**
     * 规范:输出5v电压;
     * @return
     */
    int outPut5V();
}
