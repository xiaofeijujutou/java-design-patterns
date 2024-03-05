package com.xiaofei.designpatterns.factory;

import com.xiaofei.designpatterns.factory.pizza.*;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/5 15:18
 */
public class AbstractFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pizzaName = scanner.nextLine();//前端参数
        //解耦
        OrderPizza orderPizza = new OrderPizza(new HYPizzaFactoryImpl());
        orderPizza.doPizzaOrder(pizzaName);
        orderPizza.doPizzaOrder(pizzaName, new NJPizzaFactoryImpl());
        Calendar calendar = Calendar.getInstance();
    }
}
/**
 * OrderPizza也可以抽象出一个BaseOrder,然后有NJOrder和HYOrder;
 * 然后写个解析器,解析出对应用户直接对应需要的Order,factory;
 */
class OrderPizza{
    /**
     * 订单模块聚合工厂,A披萨订单聚合A工厂,B披萨模块聚合B工厂;
     * 可以通过构造器和set来更换工厂,但是一般一个订单对应一个工厂
     */
    private IAbstractFactory factory;

    //没有工厂就默认指定一个工厂
    public OrderPizza(){
        this.factory = new HYPizzaFactoryImpl();
    }
    public OrderPizza(IAbstractFactory factory){
        this.factory = factory;
    }
    //set来更换工厂
    private void setFactory(IAbstractFactory factory){
        this.factory = factory;
    }
    //默认订单处理
    public void doPizzaOrder(String pizzaName) {
        try {
            doFinishPizza(this.factory.creatPizza(pizzaName));
        } catch (Exception e) {
            System.out.println("没有这种pizza");
        }
    }
    //更换工厂订单处理;
    public void doPizzaOrder(String pizzaName, IAbstractFactory factory) {
        setFactory(factory);
        doPizzaOrder(pizzaName);
    }
    //下订单逻辑;
    public void doFinishPizza(Pizza pizza) {
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}

interface IAbstractFactory{
    Pizza creatPizza(String pizzaName);
}

class HYPizzaFactoryImpl implements IAbstractFactory{

    @Override
    public Pizza creatPizza(String pizzaName) {
        if ("JutouPizza".equals(pizzaName)){
            return new HYJutouPizza();
        }
        if ("XiaofeiPizza".equals(pizzaName)){
            return new HYXiaofeiPizza();
        }
        return null;
    }
}
class NJPizzaFactoryImpl implements IAbstractFactory{
    @Override
    public Pizza creatPizza(String pizzaName) {
        if ("JutouPizza".equals(pizzaName)){
            return new NJJutouPizza();
        }
        if ("XiaofeiPizza".equals(pizzaName)){
            return new NJXiaofeiPizza();
        }
        return null;
    }
}