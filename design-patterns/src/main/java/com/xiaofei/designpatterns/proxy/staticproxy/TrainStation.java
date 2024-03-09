package com.xiaofei.designpatterns.proxy.staticproxy;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/8 17:16
 */


public class TrainStation implements SellTickets{
    @Override
    public void sellTickets(int money) {
        System.out.println("买票总站收到" + money+ "元");
    }
}
