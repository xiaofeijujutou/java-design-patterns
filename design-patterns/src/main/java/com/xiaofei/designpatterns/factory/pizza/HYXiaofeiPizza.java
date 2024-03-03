package com.xiaofei.designpatterns.factory.pizza;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/3 21:35
 */


public class HYXiaofeiPizza extends Pizza {
    public HYXiaofeiPizza() {
        super.name = "HYXiaofeiPizza";
    }
    @Override
    public void prepare() {
        System.out.println("准备衡阳XiaofeiPizza的材料");
    }
}
