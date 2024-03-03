package com.xiaofei.designpatterns.factory.pizza;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/3 21:36
 */


public class HYJutouPizza extends Pizza{
    public HYJutouPizza() {
        super.name = "HYJutouPizza";
    }
    @Override
    public void prepare() {
        System.out.println("准备衡阳JutouPizza的材料");
    }
}
