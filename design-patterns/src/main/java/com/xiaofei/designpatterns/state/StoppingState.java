package com.xiaofei.designpatterns.state;

/**
 * @Description: Created by IntelliJ IDEA.
 * 整个电梯属于关闭状态;
 * @Author : 小肥居居头
 * @create 2024/3/12 19:20
 */


public class StoppingState extends LiftState {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("实际业务的->电梯启动");
        super.context.setCurrentState(StateConstants.RUNNING_STATE);
    }

    @Override
    public void stop() {

    }
}
