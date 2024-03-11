package com.xiaofei.designpatterns.flyweight.box;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/11 17:24
 */


public abstract class AbstractBox {

    //返回俄罗斯方块形状
    public abstract String getShape();

    //
    public void display(String color){
        System.out.println("方块形状: " + getShape() + ",颜色: " + color);
    }
}
