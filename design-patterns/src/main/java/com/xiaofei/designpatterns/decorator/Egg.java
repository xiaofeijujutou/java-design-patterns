package com.xiaofei.designpatterns.decorator;

/**
 * @Description: Created by IntelliJ IDEA.
 * 鸡蛋,属于具体的装饰者角色,相当于房子装修的一部分,还是要依赖房子的主体;
 * @Author : 小肥居居头
 * @create 2024/3/10 16:10
 */


public class Egg extends Garnish{

    /**
     * fastFood是房子主体,
     * super(price, desc, fastFood)这里的price, desc是鸡蛋的价格和描述
     * @param fastFood 主体
     */
    public Egg(FastFood fastFood) {
        //这些参数是传给抽象装饰类的
        super(2, "加鸡蛋", fastFood);
    }

    /**
     * Egg extends Garnish extends FastFood;
     * 构造函数传过来的参数,主体是保存在聚合对象里面;
     * 装饰内容是保存在super里面;
     * @return
     */
    @Override
    public int cost() {
        return getMainFastFood().cost() + getFastFoodPrice();
    }

    @Override
    public String getDesc() {
        return getMainFastFood().getDesc() + "加鸡蛋";
    }
}
