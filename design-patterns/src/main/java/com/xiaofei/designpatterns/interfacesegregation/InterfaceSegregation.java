package com.xiaofei.designpatterns.interfacesegregation;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/2 13:47
 */


public class InterfaceSegregation {
    public static void main(String[] args) {
        //使用接口,使用的应该是功能实现类,A通过接口去依赖B类
        A a = new A();
        a.dependency1(new B());
        a.dependency2(new B());
        a.dependency3(new B());
        //C通过接口去依赖D类,所以方法直接传入D就行;
        C c = new C();
        c.dependency1(new D());
        c.dependency2(new D());
        c.dependency3(new D());
    }
}

interface TestInterface{
    void method1();
    void method2();
    void method3();
    void method4();
    void method5();
}

class B implements TestInterface{
    @Override
    public void method1() {
        System.out.println("B"+1);
    }
    @Override
    public void method2() {
        System.out.println("B"+2);
    }
    @Override
    public void method3() {
        System.out.println("B"+3);
    }
    @Override
    public void method4() {
        System.out.println("B"+4);
    }
    @Override
    public void method5() {
        System.out.println("B"+5);
    }
}

class D implements TestInterface{
    @Override
    public void method1() {
        System.out.println("D"+1);
    }
    @Override
    public void method2() {
        System.out.println("D"+2);
    }
    @Override
    public void method3() {
        System.out.println("D"+3);
    }
    @Override
    public void method4() {
        System.out.println("D"+4);
    }
    @Override
    public void method5() {
        System.out.println("D"+5);
    }
}

/**
 * 功能实现类A
 */
class A{
    public void dependency1(TestInterface b){
        b.method1();
    }
    public void dependency2(TestInterface b){
        b.method2();
    }
    public void dependency3(TestInterface b){
        b.method3();
    }
}
/**
 * 功能实现类C
 */
class C{
    public void dependency1(TestInterface b){
        b.method1();
    }
    public void dependency2(TestInterface b){
        b.method4();
    }
    public void dependency3(TestInterface b){
        b.method5();
    }
}