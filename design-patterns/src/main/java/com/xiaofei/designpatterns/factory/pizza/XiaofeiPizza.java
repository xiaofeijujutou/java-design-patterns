package com.xiaofei.designpatterns.factory.pizza;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/3 20:29
 */


public class XiaofeiPizza extends Pizza {
    public XiaofeiPizza() {
        super.name = "XiaofeiPizza";
    }
    @Override
    public void prepare() {
        System.out.println("准备XiaofeiPizza的材料");
    }
}
