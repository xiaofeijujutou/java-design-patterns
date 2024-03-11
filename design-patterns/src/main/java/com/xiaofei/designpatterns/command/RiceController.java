package com.xiaofei.designpatterns.command;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/11 20:12
 */


public class RiceController implements IController{
    private static String enableHandelUrl = "/rice.html";

    public String getEnableHandelUrl() {
        return enableHandelUrl;
    }

    //@GetMapping()
    public void handleRequest(String data){
        System.out.println("收到用户干饭指令:" + data);
    }
}
