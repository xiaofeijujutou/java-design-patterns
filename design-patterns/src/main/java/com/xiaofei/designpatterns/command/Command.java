package com.xiaofei.designpatterns.command;

/**
 * @Description: Created by IntelliJ IDEA.
 * 抽象命令类;
 * @Author : 小肥居居头
 * @create 2024/3/11 19:47
 */


public interface Command {
    void execute(Request request);
}
