package com.xiaofei.designpatterns.builder.builder;

import com.xiaofei.designpatterns.builder.builder.braking.Braking;
import com.xiaofei.designpatterns.builder.builder.engine.Engine;
import com.xiaofei.designpatterns.builder.builder.tire.Tire;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/6 21:11
 */

/**
 * 这个Builder可以造任何机械
 */
public interface IBuilder {

    Car getProduct();
    CarBuilder appendEngine(Engine engine);

    CarBuilder appendTire(Tire tire);

    CarBuilder appendBraking(Braking braking);
}
