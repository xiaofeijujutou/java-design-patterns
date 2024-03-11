package com.xiaofei.designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/11 19:14
 */


public class FestivalController {
    private List<Festival> festival;
    private Time time = new Time();
    public FestivalController(){
        festival = new ArrayList<>();
        festival.add(new DoubleEleven());
        festival.add(new DragonBoatFestival());
    }

    public void getFestivalCount(){
        festival.get(Math.abs(time.getTime()) % festival.size()).show();
    }
}
