package com.xiaofei.designpatterns.compositereuse;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/2 20:53
 */


public class CompositeReuse {
    public static void main(String[] args) {
        C c = new C();
        c.opratation(new A());
    }
}

/**
 * A是已经开发好的模块,现在开发B,想用A现成的方法;
 */
class A{
    public void opratation1(){
        System.out.println("opratation1");
    }
    public void opratation2(){
        System.out.println("opratation2");
    }
    public void opratation3(){
        System.out.println("opratation3");
    }
}
/**
 * 继承
 */
class B extends A{
    B(){
        super.opratation1();
        super.opratation2();
        super.opratation3();
    }
}

/**
 * 依赖,开发中开发者负责传入A
 */
class C{
    public void opratation(A a){
        a.opratation1();
        a.opratation2();
        a.opratation3();
    }
}

/**
 * 聚合
 */
class D{
    A a;
    public void setA(A a) {
        this.a = a;
    }
    public void opratation(){
        a.opratation1();
        a.opratation2();
        a.opratation3();
    }
}

/**
 * 组合
 */
class E{
    A a = new A();
    public void opratation(){
        a.opratation1();
        a.opratation2();
        a.opratation3();
    }
}