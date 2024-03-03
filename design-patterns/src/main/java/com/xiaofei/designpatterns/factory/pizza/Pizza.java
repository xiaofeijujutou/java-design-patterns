package com.xiaofei.designpatterns.factory.pizza;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/3 20:23
 */


public abstract class Pizza {
    /**
     * pizza名字
     */
    protected String name;

    /**
     * 不同pizza需要准备不同原材料,也就是说,需要不同实现的方法就写成抽象的;
     * 差不多相同的就直接写成具体;
     */
    public abstract void prepare();
    public void bake(){
        System.out.println("bake  " + name);
    }
    public void cut(){
        System.out.println("cut  " + name);
    }
    public void box(){
        System.out.println("box  " + name);
    }
}
