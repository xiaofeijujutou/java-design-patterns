package com.xiaofei.designpatterns.strategy;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/11 19:13
 */


public class DragonBoatFestival implements Festival {
    @Override
    public void show() {
        System.out.println("龙舟节打8折");
    }
}
