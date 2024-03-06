package com.xiaofei.designpatterns.builder.builder;

import com.xiaofei.designpatterns.builder.builder.braking.Braking;
import com.xiaofei.designpatterns.builder.builder.engine.Engine;
import com.xiaofei.designpatterns.builder.builder.tire.Tire;

/**
 * @Description: Created by IntelliJ IDEA.
 * Builder的规范:
 *      根据Director聚合的IBuilder规范来实现好创建Product的组装方法;
 *      实现有参或无参的append组装方法;
 * 如果写多个Builder,就把append方法写成无参方法,写死;
 * 如果不想写多个Builder,就带参数,根据业务灵活实现;
 * @Author : 小肥居居头
 * @create 2024/3/6 20:52
 */
public class CarBuilder implements IBuilder {
    private Car car = new Car();

    public CarBuilder() { }

    @Override
    public Car getProduct() {
        return car;
    }

    @Override
    public CarBuilder appendEngine(Engine engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public CarBuilder appendTire(Tire tire) {
        car.setTire(tire);
        return this;
    }

    @Override
    public CarBuilder appendBraking(Braking braking) {
        car.setBraking(braking);
        return this;
    }


}
