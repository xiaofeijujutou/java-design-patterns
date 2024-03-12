package com.xiaofei.designpatterns.state;

/**
 * @Description: Created by IntelliJ IDEA.
 * 当前状态是关闭,那么只有调用开启才有用;
 * 状态:电梯门已经关闭
 * @Author : 小肥居居头
 * @create 2024/3/12 19:20
 */


public class ClosingState extends LiftState {
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

    /**
     * 电梯门关闭的时候可以关闭电梯;
     */
    @Override
    public void stop() {
        System.out.println("实际业务的->关闭整个电梯");
        super.context.setCurrentState(StateConstants.STOPPING_STATE);
    }
}
