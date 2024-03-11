package com.xiaofei.designpatterns.command;

import com.xiaofei.designpatterns.facade.Light;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/11 19:56
 */


public class Tomcat {
    private List<Command> commands = new ArrayList<>();

    public Tomcat(){
        commands.add(new DispatcherCommand());
    }

    /**
     * 监听80端口
     * @param request
     */
    public void listensOnPort80(Request request){
        for (Command command : commands) {
            command.execute(request);
        }
    }
}
