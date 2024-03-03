package com.xiaofei.designpatterns.factory.pizza;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/3 20:29
 */


public class JutouPizza extends Pizza {
    public JutouPizza() {
        super.name = "JutouPizza";
    }

    @Override
    public void prepare() {
        System.out.println("准备JutouPizza的材料");
    }
}
