package com.xiaofei.designpatterns.factory.pizza;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/3 21:36
 */


public class NJJutouPizza extends Pizza {
    public NJJutouPizza() {
        super.name = "NJJutouPizza";
    }
    @Override
    public void prepare() {
        System.out.println("准备南京JutouPizza的材料");
    }
}
