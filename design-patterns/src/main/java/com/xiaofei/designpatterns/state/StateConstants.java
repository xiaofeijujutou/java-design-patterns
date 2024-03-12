package com.xiaofei.designpatterns.state;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/12 20:02
 */


public class StateConstants {
    /**
     * 所有状态列表;
     */
    public static final LiftState OPENING_STATE  = new OpeningState();
    public static final LiftState CLOSING_STATE  = new ClosingState();
    public static final LiftState STOPPING_STATE  = new StoppingState();
    public static final LiftState RUNNING_STATE  = new RunningState();
}
