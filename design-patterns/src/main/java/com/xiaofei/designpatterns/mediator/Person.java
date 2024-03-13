package com.xiaofei.designpatterns.mediator;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/13 14:50
 */


public abstract class Person {
    /**
     * 人的名字
     */
    protected String name;
    /**
     * 绑定的中介
     */
    protected Mediator mediator;
    /**
     * 需求或者供给
     */
    protected String need;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
