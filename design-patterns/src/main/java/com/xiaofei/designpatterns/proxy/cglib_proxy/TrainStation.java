package com.xiaofei.designpatterns.proxy.cglib_proxy;

import com.xiaofei.designpatterns.proxy.jdkproxy.SellTickets;

/**
 * @Description: Created by IntelliJ IDEA.
 * 这里就是没有实现接口,但是还是想动态代理;
 * @Author : 小肥居居头
 * @create 2024/3/8 17:16
 */


public class TrainStation  {

    public void sellTickets(int money) {
        System.out.println("买票总站收到" + money+ "元");
    }

    public boolean hasTicket() {
        System.out.println("总站还有票");
        return true;
    }
}
