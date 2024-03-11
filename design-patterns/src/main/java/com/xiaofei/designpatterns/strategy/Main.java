package com.xiaofei.designpatterns.strategy;

/**
 * @Description: Created by IntelliJ IDEA.
 * 策略模式在建造者模式那一块已经写过了,思路都是相通的;
 * @Author : 小肥居居头
 * @create 2024/3/11 19:09
 */


public class Main {
    public static void main(String[] args) {
        FestivalController festivalController = new FestivalController();

        festivalController.diyFestivalCount(new Festival() {
            @Override
            public void show() {
                System.out.println("自定义策略");
            }
        });
        for (int i = 0; i < 60; i++) {
            festivalController.getFestivalCount();
        }
    }
}
