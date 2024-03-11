package com.xiaofei.designpatterns.flyweight;

import com.xiaofei.designpatterns.flyweight.box.AbstractBox;
import com.xiaofei.designpatterns.flyweight.box.BoxFactory;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/11 17:23
 */


public class Main {

    public static void main(String[] args) {
        BoxFactory boxFactory = BoxFactory.getBoxFactory();
        AbstractBox i = boxFactory.getShape("I");
        String shape = i.getShape();

    }
}
