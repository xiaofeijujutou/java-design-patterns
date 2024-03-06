package com.xiaofei.designpatterns.builder.builderutils.house;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/6 12:15
 */

/**
 * 产品->product
 */

public class HighHouse extends House{
//    private String basic;
//    private String walls;
//    private String roofed;

    public HighHouse(String basic, String walls, String roofed) {
        this.basic = basic;
        this.walls = walls;
        this.roofed = roofed;
    }

    public HighHouse() {
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
        return "HighHouse{" +
                "basic='" + basic + '\'' +
                ", walls='" + walls + '\'' +
                ", roofed='" + roofed + '\'' +
                '}';
    }



}
