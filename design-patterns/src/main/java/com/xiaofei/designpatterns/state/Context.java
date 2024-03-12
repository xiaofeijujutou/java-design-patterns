package com.xiaofei.designpatterns.state;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/12 19:05
 */


public class Context {

    /**
     * 记录当前状态,外界调用run(),实际是调用currentState.run();
     * 如果里面是空方法,那就不用干什么;
     * 如果原来是stop状态,然后.run(),那么需要执行run(),然后把状态也改成run;
     */
    private LiftState currentState;

    public LiftState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(LiftState currentState) {
        this.currentState = currentState;
        this.currentState.setContext(this);
    }

    /**
     * 外界调用的不是实际操控电梯的方法,而是结果Context包装的方法;
     * 包装方法: 调用当前状态类的方法;
     */
    public void open(){
        this.currentState.open();
    }
    public void close(){
        this.currentState.close();
    }
    public void run() {
        this.currentState.run();
    }
    public void stop(){
        this.currentState.stop();
    }
}
