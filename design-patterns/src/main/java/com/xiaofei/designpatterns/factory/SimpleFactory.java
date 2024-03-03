package com.xiaofei.designpatterns.factory;

import com.xiaofei.designpatterns.factory.pizza.Pizza;

import java.util.Scanner;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/3 20:21
 */
public class SimpleFactory {
    //GetMapping
    public static void main(String[] args) {
        System.out.println("前端发送pizza参数");
        PizzaOrderController pizzaOrderController = new PizzaOrderController();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            System.out.println("请输入pizza");
            String pizzaName = scanner.nextLine();
            if ("exit".equals(pizzaName)) {
                break;
            }
            pizzaOrderController.doPizzaOrder(pizzaName);
        }
    }
}

class PizzaOrderController {
    //这里使用硬编码
    PizzaSimpleFactory pizzaSimpleFactory = PizzaSimpleFactory.getInstance();

    public void doPizzaOrder(String pizzaName) {
        try {
            doFinishPizza(pizzaSimpleFactory.getPizza(pizzaName));
        } catch (Exception e) {
            System.out.println("没有这种pizza");
        }
    }

    public void doFinishPizza(Pizza pizza) {
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}

/**
 * Pizza工厂类,负责根据前端参数创建对应pizza;
 * 如果开发后续要添加pizza,这里完全不需要修改其他代码,只要往里面加就行了;
 */
class PizzaSimpleFactory {
    //工厂设计成单例的;
    public static final PizzaSimpleFactory pizzaSimpleFactory = new PizzaSimpleFactory();

    public static PizzaSimpleFactory getInstance(){
        return PizzaSimpleFactory.pizzaSimpleFactory;
    }
    /**
     * 工厂核心方法,这里通过反射来实现寻找对应的具体Pizza类;
     *
     * @param pizzaName pizza名字
     * @return
     * @throws Exception 没有对应pizza
     */
    public Pizza getPizza(String pizzaName) throws Exception {
        //可以用反射来查对应Pizza,也可以用map函数,或者Spring框架;
        Class clazz = Class.forName("com.xiaofei.designpatterns.factory.pizza." + pizzaName);
        return (Pizza) clazz.newInstance();
    }
}