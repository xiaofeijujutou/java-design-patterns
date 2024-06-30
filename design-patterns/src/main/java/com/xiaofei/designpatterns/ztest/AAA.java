package com.xiaofei.designpatterns.ztest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/18 14:05
 */

@Component("aaa")
public class AAA {
    @Autowired
    private BBB bbb;

    @Override
    public String toString() {
        System.out.println(bbb);
        return "AAA{}";
    }
}
