package com.xiaofei.designpatterns.factory.pizza;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/3 21:35
 */


public class NJXiaofeiPizza extends Pizza {
    public NJXiaofeiPizza() {
        super.name = "NJXiaofeiPizza";
    }
    @Override
    public void prepare() {
        System.out.println("准备南京XiaofeiPizza的材料");
    }
}
