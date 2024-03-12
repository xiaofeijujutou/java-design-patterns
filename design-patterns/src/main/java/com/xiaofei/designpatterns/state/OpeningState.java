package com.xiaofei.designpatterns.state;

/**
 * @Description: Created by IntelliJ IDEA.
 * 这个是opening类,那么状态已经是opening了;
 * 状态:电梯门已经打开
 * @Author : 小肥居居头
 * @create 2024/3/12 19:20
 */


public class OpeningState extends LiftState {

    /**
     * 从类可以看出,现在状态是Opening,那么调用open()方法肯定是无效的;
     */
    @Override
    public void open() {
        //什么都不做
    }

    /**
     * 从类可以看出,现在状态是Opening,那么调用close方法肯定是有效的
     */
    @Override
    public void close() {
        //执行关闭方法,然后把状态设置为关闭;
        System.out.println("实际业务的->电梯关闭电梯门");
        super.context.setCurrentState(StateConstants.CLOSING_STATE);
    }

    /**
     * 其他的状态是不支持由这种状态转换的;
     */
    @Override
    public void run() {
        //什么都不做
    }

    @Override
    public void stop() {
        //什么都不做
    }
}
