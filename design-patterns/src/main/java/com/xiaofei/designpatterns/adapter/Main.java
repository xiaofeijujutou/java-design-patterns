package com.xiaofei.designpatterns.adapter;


import org.springframework.web.servlet.DispatcherServlet;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/7 18:43
 */


public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter200To5());
        phone.charging(new VoltageAdapter380To5());
        System.out.println("=================>接口适配器抽象类");
        phone.charging(new AbstractVoltageAdapter(){
            //只覆盖需要使用的方法;
            @Override
            public int outPut5V() {
                return 5;
            }
        });
    }
}
