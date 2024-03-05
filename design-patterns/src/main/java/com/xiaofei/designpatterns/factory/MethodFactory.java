package com.xiaofei.designpatterns.factory;

import com.xiaofei.designpatterns.factory.pizza.Pizza;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/3 21:28
 */


public class MethodFactory {
    public static void main(String[] args) {
        //TODO 待完善;方法工厂模式设计的条件:
        //	用户先已经指定了一个种类的pizza, 然后对里面的种类再次进行挑选;
        //  方法工厂应该要按照这种条件设计
        //  视频: 直接写在构造方法里面, NJ工厂, HY工厂, 然后传参来指定工厂生产什么pizza;
    }
}

/**
 * 这里根据业务需要,只要抽象出两层就行了,所以不用三层;
 */
abstract class PizzaMethodFactory {
    /**
     * 方法工厂核心方法,根据不同产品选择不同工厂去制造产品;
     *
     * @param pizzaName pizza名字
     * @return
     * @throws Exception 没有对应pizza
     */
    public Pizza getPizza(String pizzaName) throws Exception {
        String prefix = pizzaName.substring(0,2);
        //直接反射拿到工厂;
        Class factoryClass = Class.forName("com.xiaofei.designpatterns.factory." + prefix + "PizzaFactory");
        //然后反射拿到pizza;
        PizzaMethodFactory factory = (PizzaMethodFactory)factoryClass.newInstance();
        return factory.getPizza(pizzaName);
    }

    /**
     * 这是方法工厂的抽象层工厂,底下的具体层工厂需要实现这个方法;
     * 因为要根据不同产品创建不同的方法;
     * @param pizzaName
     * @return
     * @throws Exception 没有这种pizza抛异常;
     */
    public abstract Pizza getConcretePizza(String pizzaName) throws Exception;
}

/**
 * 不同的Pizza也可以对应不同的包;
 */
class HYPizzaFactory extends PizzaMethodFactory{
    @Override
    public Pizza getConcretePizza(String pizzaName) throws Exception {
        Class clazz = Class.forName("com.xiaofei.designpatterns.factory.pizza." + pizzaName);
        return (Pizza) clazz.newInstance();
    }
}
class NJPizzaFactory extends PizzaMethodFactory{
    @Override
    public Pizza getConcretePizza(String pizzaName) throws Exception {
        Class clazz = Class.forName("com.xiaofei.designpatterns.factory.pizza." + pizzaName);
        return (Pizza) clazz.newInstance();
    }
}