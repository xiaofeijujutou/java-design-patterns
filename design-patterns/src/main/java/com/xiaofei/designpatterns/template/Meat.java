package com.xiaofei.designpatterns.template;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/11 18:43
 */


public class Meat extends AbstractCook {
    @Override
    protected void pourVegetable() {
        System.out.println("放入肉");
    }

    @Override
    protected void addSauce() {
        System.out.println("加20克盐");
    }
}
