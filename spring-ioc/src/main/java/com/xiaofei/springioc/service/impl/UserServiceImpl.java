package com.xiaofei.springioc.service.impl;

import com.xiaofei.springioc.dao.UserDao;
import com.xiaofei.springioc.service.UserService;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/14 14:41
 */


public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public UserServiceImpl() {
        System.out.println("UserServiceImpl被创建了");
    }

    @Override
    public void service() {
        System.out.println("UserServiceImpl.service()");
        userDao.add();
    }
}
