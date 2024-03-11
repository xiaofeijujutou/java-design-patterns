package com.xiaofei.designpatterns.combination;

import com.xiaofei.designpatterns.facade.Light;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: Created by IntelliJ IDEA.
 * 这个类属于树枝类
 * @Author : 小肥居居头
 * @create 2024/3/11 16:26
 */


public class Menu extends MenuComponent{

    private List<MenuComponent> menuComponentList = new ArrayList<>();

    public Menu(String name, int level){
        super.name = name;
        super.level = level;
    }

    @Override
    public MenuComponent add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
        return this;
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    /**
     * 寻找需要对应业务
     * @param index
     */
    @Override
    public MenuComponent find(int index) {
        return menuComponentList.get(index);
    }

    @Override
    public void printAll() {
        printNameByLevel();
        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.printAll();
        }
    }
}
