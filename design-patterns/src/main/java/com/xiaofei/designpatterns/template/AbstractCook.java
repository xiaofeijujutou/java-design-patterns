package com.xiaofei.designpatterns.template;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/11 18:37
 */


public abstract class AbstractCook {
    protected void pourOil(){
        System.out.println("默认倒入三克油");
    }
    protected void heatOil(){
        System.out.println("默认加热油三秒");
    }
    protected void pourVegetable(){
        System.out.println("默认加入三十克蔬菜");
    }
    protected void addSauce(){
        System.out.println("默认倒入三克盐");
    }
    public final void cook(){
        pourOil();
        heatOil();
        pourVegetable();
        addSauce();
        System.out.println("菜已经做好");
    }


}
