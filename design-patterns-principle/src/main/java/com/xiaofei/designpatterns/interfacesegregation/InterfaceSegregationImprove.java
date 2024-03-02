package com.xiaofei.designpatterns.interfacesegregation;

/**
 * @Description: Created by IntelliJ IDEA.
 * 对接口进行拆分,实现最小依赖
 * @Author : 小肥居居头
 * @create 2024/3/2 13:47
 */


public class InterfaceSegregationImprove {
    public static void main(String[] args) {
        //使用接口,使用的应该是功能实现类,A通过接口去依赖B类
        APlus a = new APlus();
        a.dependency1(new BPlus());
        a.dependency2(new BPlus());
        a.dependency3(new BPlus());
        //C通过接口去依赖D类,所以方法直接传入D就行;
        CPlus c = new CPlus();
        c.dependency1(new DPlus());
        c.dependency2(new DPlus());
        c.dependency3(new DPlus());
    }
}

/**
 * 多个接口
 */
interface TestInterface1{
    void method1();
}

interface TestInterface23{
    void method2();
    void method3();
}
interface TestInterface45{
    void method4();
    void method5();
}

/**
 * 接口实现类
 */
class BPlus implements TestInterface1, TestInterface23{
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
}

class DPlus implements TestInterface1, TestInterface45{
    @Override
    public void method1() {
        System.out.println("D"+1);
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
 * 功能实现类APlus,依赖于BPlus
 */
class APlus{
    public void dependency1(TestInterface1 t1){
        t1.method1();
    }
    public void dependency2(TestInterface23 t23){
        t23.method2();
    }
    public void dependency3(TestInterface23 t23){
        t23.method3();
    }
}
/**
 * 功能实现类CPlus
 */
class CPlus{
    public void dependency1(TestInterface1 t1){
        t1.method1();
    }
    public void dependency2(TestInterface45 t45){
        t45.method4();
    }
    public void dependency3(TestInterface45 t45){
        t45.method5();
    }
}
