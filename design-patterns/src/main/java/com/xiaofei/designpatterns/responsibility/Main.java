package com.xiaofei.designpatterns.responsibility;

import java.util.Random;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/12 14:38
 */


public class Main {
    static Random r = new Random();
    public static void main(String[] args) {
        Handler groupLeader = new GroupLeader("小组领导");
        Handler groupManager = new GroupManager("小组经理");
        Handler groupBoss = new GroupBoss("公司老板");
        //设置领导
        groupLeader.setNextHandler(groupManager);
        groupManager.setNextHandler(groupBoss);

        //创建请求
        for (int i = 0; i < 100; i++) {
            LeaveRequest request = new LeaveRequest(
                    "测试" + i,Math.abs(r.nextInt()) % 18, "就想请假");
            groupLeader.submit(request);
            System.out.println("====>>>>");
        }
    }
}
