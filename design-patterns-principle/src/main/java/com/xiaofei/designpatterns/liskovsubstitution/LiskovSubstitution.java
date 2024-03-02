package com.xiaofei.designpatterns.liskovsubstitution;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/2 17:06
 */


public class LiskovSubstitution {
    public static void main(String[] args) {
        A a = new A();
        a.func1(1,4);//相减
        B b = new B();
        b.func1(1,4);//相加
    }

}

class A{
    public int func1(int i1, int i2){
        return i1 - i2;
    }
}

/**
 * 重写了方法,使用B对象调用重写方法的话就会用B逻辑;
 */
class B extends A{
    @Override
    public int func1(int i1, int i2){
        return i1 + i2;
    }
    public int func2(int i1, int i2){
        return func1(i1 , i2) + 10;
    }
}