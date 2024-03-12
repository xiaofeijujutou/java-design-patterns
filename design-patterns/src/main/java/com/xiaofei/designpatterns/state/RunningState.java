package com.xiaofei.designpatterns.state;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * 电梯现在是运行中,默认肯定是关门
 * @create 2024/3/12 19:20
 */


public class RunningState extends LiftState {
    @Override
    public void open() {
        System.out.println("实际业务的->电梯打开电梯门");
        super.context.setCurrentState(StateConstants.OPENING_STATE);
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {
        System.out.println("实际业务的->关闭电梯");
        super.context.setCurrentState(StateConstants.STOPPING_STATE);
    }
}
