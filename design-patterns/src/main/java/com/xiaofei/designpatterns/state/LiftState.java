package com.xiaofei.designpatterns.state;

/**
 * @Description: Created by IntelliJ IDEA.
 * 环境角色类;
 * @Author : 小肥居居头
 * @create 2024/3/12 19:04
 */


public abstract class LiftState {
    /**
     * 记录当前上下文,因为State初始化的时候是不会设置context的;
     */
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    //不同状态调用方法执行的是不同的效果;
    public abstract void open();
    public abstract void close();
    public abstract void run() ;
    public abstract void stop();
}
