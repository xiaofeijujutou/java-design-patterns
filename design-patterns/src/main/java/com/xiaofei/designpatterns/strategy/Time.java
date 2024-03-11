package com.xiaofei.designpatterns.strategy;

import java.util.Random;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/11 19:10
 */


public class Time {
    public int getTime(){
        return new Random().nextInt();
    }
}
