package com.xiaofei.designpatterns.facade;



import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/10 19:30
 */


public class Main {
    public static void main(String[] args) {
        SmartApplicationFacade smart = new SmartApplicationFacade();
        smart.say("打开电灯泡,我的电脑,空调冰箱");

        smart.say("关闭电灯泡,我的电脑,空调冰箱");
        smart.openAllMachine();
        smart.offAllMachine();
        smart.openSomeMachine(1);
        smart.offSomeMachine(1);
    }
}

class HttpDemo extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession();
        req.getCookies();
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String method = req.getMethod();
        if ("get".equalsIgnoreCase(method)){
            doGet(req, resp);
        }else  if ("post".equalsIgnoreCase(method)){
            doPost(req, resp);
        }
    }
}
