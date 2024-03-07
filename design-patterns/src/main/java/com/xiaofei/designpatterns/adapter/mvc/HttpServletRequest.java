package com.xiaofei.designpatterns.adapter.mvc;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/7 22:20
 */


public class HttpServletRequest {
    private int i;
    public HttpServletRequest(int i){
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
