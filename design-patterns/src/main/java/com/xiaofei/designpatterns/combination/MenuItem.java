package com.xiaofei.designpatterns.combination;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/11 16:41
 */


public class MenuItem extends MenuComponent {

    public MenuItem(String name, int level){
        super.name = name;
        super.level = level;
    }
    @Override
    public void printAll() {
        printNameByLevel();
    }
}
