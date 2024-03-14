package com.xiaofei.springioc.dao.impl;

import com.xiaofei.springioc.dao.UserDao;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/14 14:38
 */


public class UserDaoImpl implements UserDao {

    private String test;
    private Integer i;

    public void setTest(String test) {
        this.test = test;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    @Override
    public void add() {
        System.out.println("添加用户UserDaoImpl.add()");
        System.out.println("UserDaoImpl中的属性String test:" + test);
        System.out.println("UserDaoImpl中的属性 Integer i:" + i);
    }
}
