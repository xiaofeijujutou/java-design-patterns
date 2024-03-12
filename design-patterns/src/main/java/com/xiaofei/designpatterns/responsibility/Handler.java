package com.xiaofei.designpatterns.responsibility;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/12 14:45
 */


public abstract class Handler {
    protected final static int GROUP_LEADER = 3;
    protected final static int GROUP_MANAGER = 5;
    protected final static int GROUP_BOSS = 9;

    //该领导名字:
    protected String leaderName;

    //声明后续者（声明上级领导）
    private Handler nextHandler;

    public Handler(String leaderName) {
        this.leaderName = leaderName;
    }


    //设置上级领导对象
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 各级领导处理请求条的方法,抽象方法,需要子类实现;
     * 能处理返回true,不能处理返回false
     */
    protected abstract boolean handleLeave(LeaveRequest leave);

    /**
     * 所有领导处理请求条的流程,声明final标识流程无法更改,表示所有领导都要遵循这个流程;
     * 也就是先自己处理,处理不了就给上级;
     * 提交请假条,然后就执行submit这个流程;
     * @param leave
     */
    public final void submit(LeaveRequest leave) {
        boolean result = this.handleLeave(leave);
        //该领导进行审批,如果处理成功则直接返回;
        if (result){
            System.out.println("请假条已经被: " + leaderName + "所处理");
        }
        //处理不了且有上级领导:
        else if (!result && this.nextHandler != null){
            this.nextHandler.submit(leave);
        }
        //处理不了且没有上级领导:
        else if (!result && this.nextHandler == null){
            System.out.println("请假条不合理,流程结束！");
        }
    }
}
