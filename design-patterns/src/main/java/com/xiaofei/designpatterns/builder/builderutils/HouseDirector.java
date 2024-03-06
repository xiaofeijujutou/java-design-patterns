package com.xiaofei.designpatterns.builder.builderutils;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/6 15:29
 */

import com.xiaofei.designpatterns.builder.builderutils.house.HighHouse;
import com.xiaofei.designpatterns.builder.builderutils.house.House;
import com.xiaofei.designpatterns.builder.builderutils.house.LowHouse;

/**
 * 指挥者,动态指定制作流程;
 */
public class HouseDirector {
    HighHouseBuilder highHouseBuilder;

    public HouseDirector(House house) {
        if (house.getClass().equals(HighHouse.class)) {
            this.highHouseBuilder = new HighHouseBuilder();
        }
        if (house.getClass().equals(LowHouse.class)) {
            this.highHouseBuilder = new HighHouseBuilder();
        }
    }

    public HighHouseBuilder getHouseBuilder(Class<? extends House> house) {
        if (house.getClass().equals(HighHouse.class)) {
            this.highHouseBuilder = new HighHouseBuilder();
            return this.highHouseBuilder;
        }
        if (house.getClass().equals(LowHouse.class)) {
            return this.highHouseBuilder;
        }
        return null;
    }
}
