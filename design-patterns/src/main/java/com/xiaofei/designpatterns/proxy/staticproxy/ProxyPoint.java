package com.xiaofei.designpatterns.proxy.staticproxy;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/8 17:19
 */


public class ProxyPoint implements SellTickets {
    private TrainStation trainStation = new TrainStation();
    @Override
    public void sellTickets(int money) {
        int count = money / 3;
        System.out.println("代理商抽成" + count + "元");
        trainStation.sellTickets(money - count);
    }
}
