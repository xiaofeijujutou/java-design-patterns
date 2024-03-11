package com.xiaofei.designpatterns.flyweight.box;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/11 17:28
 */


public class BoxFactory {
    private Map<String, AbstractBox> boxs;

    private static BoxFactory boxFactory = new BoxFactory();

    public static BoxFactory getBoxFactory(){
        return boxFactory;
    }

    private BoxFactory() {
        boxs = new HashMap<>();
        boxs.put("I", new IBox());
        boxs.put("L", new LBox());
        boxs.put("O", new OBox());
    }

    public AbstractBox getShape(String name) {
        return boxs.get(name);
    }
}
