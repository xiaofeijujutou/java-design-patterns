package com.xiaofei.designpatterns.adapter;

/**
 * @Description: Created by IntelliJ IDEA.
 * 适配器;
 * 需要实现的功能:
 *      拿到被适配类的数据,然后修改数据满足接口规范;
 * @Author : 小肥居居头
 * @create 2024/3/7 20:04
 */
public class VoltageAdapter200To5 extends Voltage220V implements IVoltage5V {
    @Override
    public final int outPut5V() {
        //业务处理逻辑,先获取原来适配器的数据;
        int source = super.outPut220V();
        //将原来适配器的数据进行实际业务修改处理;
        int destination = source / 44;
        //然后再输出出去;
        System.out.println("转换后电压:" + destination);
        return destination;
    }
}
