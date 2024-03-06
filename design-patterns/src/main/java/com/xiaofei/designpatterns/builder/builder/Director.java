package com.xiaofei.designpatterns.builder.builder;

import com.xiaofei.designpatterns.builder.builder.braking.Braking;
import com.xiaofei.designpatterns.builder.builder.engine.Engine;
import com.xiaofei.designpatterns.builder.builder.tire.Tire;

/**
 * @Description: Created by IntelliJ IDEA.
 * 指导者的作用:
 *      接收开发者传递的Builder对象,来感知用户需要造什么产品;
 * construct(有参/无参)方法作用:
 *      直接创建好实体类并且返回Product;
 * @Author : 小肥居居头
 * @create 2024/3/6 20:52
 */


public class Director {

    private IBuilder builder;

    public Director(IBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(IBuilder builder) {
        this.builder = builder;
    }

    /**
     * 调用这个方法就是让控制器帮我们制造并且返回实体类;
     * 这样写是动态选择参数,表示业务中有很多变量需要控制,由开发者选择;
     * 如果Builder里面的append都是void,那就是每一种都是写死的,需要根据业务灵活变通
     * @param engine
     * @param tire
     * @param braking
     * @return
     */
    public Product construct(Engine engine, Tire tire, Braking braking) {
        builder.appendEngine(engine);
        builder.appendBraking(braking);
        builder.appendTire(tire);
        return builder.getProduct();
    }

}
