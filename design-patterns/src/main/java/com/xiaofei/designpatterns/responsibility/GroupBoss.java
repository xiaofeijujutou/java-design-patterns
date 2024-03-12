package com.xiaofei.designpatterns.responsibility;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/12 15:17
 */


public class GroupBoss extends Handler{
    public GroupBoss(String leaderName) {
        super(leaderName);
    }

    @Override
    public boolean handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() +"天,原因:" + leave.getContent());
        System.out.println("审批领导:" + leaderName);
        return leave.getNum() <= GROUP_BOSS;
    }
}
