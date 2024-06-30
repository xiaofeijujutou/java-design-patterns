package com.xiaofei.designpatterns.ztest;

import org.springframework.stereotype.Component;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/18 14:05
 */

@Component("bbb")
public class BBB {

    private AAA aaa;

    @Override
    public String toString() {
        return "BBB{}";
    }
}
