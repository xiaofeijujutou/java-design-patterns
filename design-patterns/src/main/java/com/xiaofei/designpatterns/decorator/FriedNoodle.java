package com.xiaofei.designpatterns.decorator;

/**
 * @Description: Created by IntelliJ IDEA.
 * 炒面
 * @Author : 小肥居居头
 * @create 2024/3/10 16:04
 */


public class FriedNoodle extends FastFood{

    public FriedNoodle(){
        super(28,"炒面");
    }

    @Override
    public int cost() {
        return getFastFoodPrice();
    }
}
