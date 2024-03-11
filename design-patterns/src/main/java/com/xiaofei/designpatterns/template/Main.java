package com.xiaofei.designpatterns.template;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/11 18:36
 */


public class Main {
    public static void main(String[] args) {
        AbstractCook abstractCook = new Meat();
        abstractCook.cook();
        AbstractCook abstractCook1 = new Cake();
        abstractCook1.cook();
    }
}
