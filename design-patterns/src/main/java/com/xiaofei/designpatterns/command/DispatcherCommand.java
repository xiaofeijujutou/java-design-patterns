package com.xiaofei.designpatterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/11 19:48
 */


public class DispatcherCommand implements Command {


    private List<IController> controllers;

    /**
     * 通过注解扫包
     */
    public DispatcherCommand() {
        controllers = new ArrayList<>();
        controllers.add(new Controller());
        controllers.add(new RiceController());
    }

    @Override
    public void execute(Request request) {
        String requestUrl = request.getUrl();
        for (IController controller : controllers) {
            String enableHandelUrl = controller.getEnableHandelUrl();
            if (urlMatcher(requestUrl, enableHandelUrl)) {
                controller.handleRequest(request.getData());
                return;
            }
        }
        System.out.println("404,未找到页面");
    }

    private boolean urlMatcher(String requestUrl, String enableHandelUrl) {
        return requestUrl.contains(enableHandelUrl);
    }
}
