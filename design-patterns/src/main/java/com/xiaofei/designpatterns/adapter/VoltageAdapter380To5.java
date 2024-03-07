package com.xiaofei.designpatterns.adapter;

/**
 * @Description: Created by IntelliJ IDEA.
 * 380v转5v;
 * @Author : 小肥居居头
 * @create 2024/3/7 20:04
 */
public class VoltageAdapter380To5 extends Voltage380V implements IVoltage5V {

    @Override
    public final int outPut5V() {
        //业务处理逻辑,先获取原来适配器的数据;
        int source = super.outPut380V();
        //将原来适配器的数据进行实际业务修改处理;
        int destination = source / 72;
        //然后再输出出去;
        System.out.println("转换后电压:" + destination);
        return destination;
    }
}
