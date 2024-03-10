package com.xiaofei.designpatterns.decorator;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/10 16:01
 */


public abstract class FastFood {

    //主体价格
    private int fastFoodPrice;
    //描述
    private String desc;

    public FastFood() {
    }
    public FastFood(int fastFoodPrice, String desc) {
        this.fastFoodPrice = fastFoodPrice;
        this.desc = desc;
    }

    /**
     * 返回这个快餐套餐的价格;
     * 如果是用了装饰者模式
     * @return
     */
    public abstract int cost();


    public int getFastFoodPrice() {
        return fastFoodPrice;
    }

    public void setFastFoodPrice(int fastFoodPrice) {
        this.fastFoodPrice = fastFoodPrice;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
