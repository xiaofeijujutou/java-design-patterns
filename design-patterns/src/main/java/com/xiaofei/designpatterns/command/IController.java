package com.xiaofei.designpatterns.command;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/11 20:13
 */


public interface IController {
    String getEnableHandelUrl();


    void handleRequest(String data);
}
