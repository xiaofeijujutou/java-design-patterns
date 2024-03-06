package com.xiaofei.designpatterns.builder.builderutils;

import com.xiaofei.designpatterns.builder.builderutils.house.HighHouse;
/**
 * @Description: Created by IntelliJ IDEA.
 * 这样写的好处:
 *      如果一个类需要复杂的创建流程,就可以把这个类的属性用一个Builder保存起来,
 *      在Builder里面写好创建逻辑;
 * 这样写的缺点:
 *      简单构造器,只能针对一个类去写特定的Builder,不能实现一个Builder创建多种
 *      对象;
 * @Author : 小肥居居头
 * @create 2024/3/6 15:25
 */
public class HighHouseBuilder {
    //变量声明成final,只通过构造器初始化一次,如果需要修改,
    //就再生成一个HouseBuilder对象用构造器初始化;
    private final String basic;
    private final String walls;
    private final String roofed;
    //无参构造器,把对象初始化成null;
    public HighHouseBuilder() {
        this.basic = null;
        this.walls = null;
        this.roofed = null;
    }
    //全参构造器,作用是copy对象属性;
    private HighHouseBuilder(String basic, String walls, String roofed) {
        this.basic = basic;
        this.walls = walls;
        this.roofed = roofed;
    }

    //通过不断的new新的HouseBuilder来实现建造而不需要关心具体流程;
    public HighHouseBuilder basic(String basic){
        return new HighHouseBuilder(basic, this.walls, this.roofed);
    }
    public HighHouseBuilder walls(String walls){
        return new HighHouseBuilder(this.basic, walls, this.roofed);
    }
    public HighHouseBuilder roofed(String roofed){
        return new HighHouseBuilder(this.basic, this.walls, roofed);
    }

    //核心创建对象的代码写在这里;
    public HighHouse build(){
        return new HighHouse(basic, walls, roofed);
    }
}
