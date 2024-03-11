package com.xiaofei.designpatterns.command;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/11 19:29
 */


public class Main {
    private static Tomcat tomcat = new Tomcat();

    public static void main(String[] args) {
        Request request = new Request("http://xiaofeishop/xiaofei.html","用户请求模拟数据");
        Request request1 = new Request("http://xiaofeishop/rice.html","用户请求干饭");
        Request request2 = new Request("瞎请求","用户请求干饭");

        tomcat.listensOnPort80(request);
        tomcat.listensOnPort80(request1);
        tomcat.listensOnPort80(request2);
    }
}
