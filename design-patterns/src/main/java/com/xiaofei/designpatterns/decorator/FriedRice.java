package com.xiaofei.designpatterns.decorator;

/**
 * @Description: Created by IntelliJ IDEA.
 * 炒饭
 * @Author : 小肥居居头
 * @create 2024/3/10 16:04
 */


public class FriedRice extends FastFood{

    public FriedRice(){
        super(18,"炒饭");
    }

    @Override
    public int cost() {
        return getFastFoodPrice();
    }
}
