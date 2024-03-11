package com.xiaofei.designpatterns.combination;

/**
 * @Description: Created by IntelliJ IDEA.
 * 统一一个接口(指针),这个指针可以兼容所有的子类实现;
 * 容器也是这个指针列表或者map;
 * @Author : 小肥居居头
 * @create 2024/3/11 15:05
 */


public abstract class MenuComponent {
    //菜单组件名称
    protected String name;
    //菜单组件层级
    protected int level;

    /**
     * 添加子菜单,菜单要重写这些异常方法,菜单项不用;
     * 树枝节点要重写,叶子节点不用;
     * 默认不充写就报异常;
     * @param menuComponent
     */
    public MenuComponent add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    /**
     * 移除子菜单;
     * @param menuComponent
     */
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    /**
     * 寻找指定子菜单
     */
    public MenuComponent find(int i){
        throw new UnsupportedOperationException();
    }

    /**
     * 获取当前菜单/菜单项名字
     */
    public String getCurrentName(){
        return name;
    }

    public void printNameByLevel(){
        for (int i = 1; i < level; i++) {
            System.out.print("  ");
        }
        System.out.println(name);
    }
    /**
     * 打印所有信息
     * 菜单就打印自己的name,然后遍历打印自己的子节点的所有方法;
     * 菜单项就打印自己的name就行了
     */
    public abstract void printAll();
}
