package com.xiaofei.designpatterns.builder.builderutils.house;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/6 12:15
 */

public class LowHouse extends House{

    //这些成员属性可能是其他对象,或者说是那种创建起来很繁杂的对象;
//    private String basic;
//    private String walls;
//    private String roofed;

    public LowHouse(String basic, String walls, String roofed) {
        this.basic = basic;
        this.walls = walls;
        this.roofed = roofed;
    }
    public LowHouse() {
    }
    @Override
    public void buildBasic(String basic) {
        this.basic = basic;
    }

    @Override
    public void buildWalls(String walls) {
        this.walls = walls;
    }

    @Override
    public void buildRoofed(String roofed) {
        this.roofed = roofed;
    }

    @Override
    public String toString() {
        return "LowHouse{" +
                "basic='" + basic + '\'' +
                ", walls='" + walls + '\'' +
                ", roofed='" + roofed + '\'' +
                '}';
    }
}
