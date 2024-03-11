package com.xiaofei.designpatterns.command;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/11 19:46
 */


public class Controller implements IController{
    private static String enableHandelUrl = "/xiaofei.html";

    public String getEnableHandelUrl() {
        return enableHandelUrl;
    }

    //@GetMapping()
    public void handleRequest(String data){
        System.out.println("后端接收到前段数据:" + data);
    }
}
