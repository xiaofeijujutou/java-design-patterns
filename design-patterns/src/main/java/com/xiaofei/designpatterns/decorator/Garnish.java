package com.xiaofei.designpatterns.decorator;

/**
 * @Description: Created by IntelliJ IDEA.
 * 装饰者类,属于抽象装饰者;
 * 抽象装饰者,继承了一份FastFood,又聚合了一分FastFood,
 * 也就是说这个类有两份FastFood的参数;
 * @Author : 小肥居居头
 * @create 2024/3/10 16:07
 */


public abstract class Garnish extends FastFood {
    private FastFood mainFastFood;


    public Garnish(FastFood mainFastFood) {
        this.mainFastFood = mainFastFood;
    }

    /**
     * 构造函数传过来的参数,主体是保存在聚合对象里面;
     * 装饰内容是保存在super里面;
     * @param decoratorPrice 装饰者价格
     * @param decoratorDesc 装饰者描述
     * @param mainFastFood 主体数据
     */
    public Garnish(int decoratorPrice, String decoratorDesc, FastFood mainFastFood) {
        super(decoratorPrice, decoratorDesc);
        this.mainFastFood = mainFastFood;
    }

    public FastFood getMainFastFood() {
        return mainFastFood;
    }

    public void setMainFastFood(FastFood mainFastFood) {
        this.mainFastFood = mainFastFood;
    }
}
