package com.xiaofei.designpatterns.builder.builderutils.house;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/6 12:12
 */

/**
 * 这是老版本的创建类的方法;
 * 这里要创建的肯定不是实体类,而是功能类,需要多个配件组装起来使用的类;
 */
public abstract class House {

    String basic;
    String walls;
    String roofed;

    /**
     *相当于set方法来实现组装
     */
    abstract public void buildBasic(String basic);
    abstract public void buildWalls(String walls);
    abstract public void buildRoofed(String roofed);

    /**
     * 相当于全参构造器来实现组装
     */
    public void build(String basic, String walls, String roofed){
        buildBasic(basic);
        buildWalls(walls);
        buildRoofed(roofed);
    }
}
