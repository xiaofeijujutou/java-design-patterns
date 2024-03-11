package com.xiaofei.designpatterns.template;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/11 18:43
 */


public class Cake extends AbstractCook {

    @Override
    protected void pourOil() {
        System.out.println("加入33克油");
    }

    @Override
    protected void pourVegetable() {
        System.out.println("放入蛋糕");
    }

    @Override
    protected void addSauce() {
        System.out.println("不加盐");
    }
}
