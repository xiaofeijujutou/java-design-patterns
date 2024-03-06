package com.xiaofei.designpatterns.builder.builder;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/6 18:36
 */

import com.xiaofei.designpatterns.builder.builder.braking.Braking;
import com.xiaofei.designpatterns.builder.builder.engine.Engine;
import com.xiaofei.designpatterns.builder.builder.tire.Tire;

/**
 * 产品,包含很多套餐
 * 假设是造车;
 * 造一辆车有很多种类型的配件;
 */
public class Car implements Product{
    private Engine engine;
    private Tire tire;
    private Braking braking;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public Braking getBraking() {
        return braking;
    }

    public void setBraking(Braking braking) {
        this.braking = braking;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", tire=" + tire +
                ", braking=" + braking +
                '}';
    }
}
