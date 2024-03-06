package com.xiaofei.designpatterns.builder.builderutils;

import com.xiaofei.designpatterns.builder.builderutils.house.HighHouse;
import com.xiaofei.designpatterns.builder.builderutils.house.House;


/**
 * @Description: Created by IntelliJ IDEA.
 * TaskExecutorBuilder建造者模式防止创建的对象中途不一样,每次都会new一个Builder
 * @Author : 小肥居居头
 * @create 2024/3/6 12:11
 */


public class Builder {
    public static void main(String[] args) {
        //origin();
        HighHouseBuilder highHouseBuilder = new HighHouseBuilder();
        HighHouse build = highHouseBuilder
                .basic("高楼地基")
                .walls("高楼墙")
                .roofed("高楼楼顶")
                .build();
        System.out.println(build);

//        TaskExecutorBuilder t = new TaskExecutorBuilder();
//        ThreadPoolTaskExecutor build = t.allowCoreThreadTimeOut(false).corePoolSize(1).build();
//        ThreadPoolTaskExecutor build1 = t.build();
//        System.out.println(build.equals(build1));
    }

    public static void origin(){
        //其实还是相当于set和构造器;
        //先创建骨骼框架;
        House house = new HighHouse();
        //然后在代码块里面拼接所需要的其他材料;
        String highBasic = new String("高楼地基");
        String highWalls = new String("高楼墙");
        String highRoof = new String("高楼楼顶");
        //然后建造
        house.buildBasic(highBasic);
        house.buildRoofed(highRoof);
        house.buildWalls(highWalls);
        System.out.println(house);
    }
}

