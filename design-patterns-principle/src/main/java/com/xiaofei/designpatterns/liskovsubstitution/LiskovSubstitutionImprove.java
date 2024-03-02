package com.xiaofei.designpatterns.liskovsubstitution;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/2 17:06
 */


public class LiskovSubstitutionImprove {
    public static void main(String[] args) {
        AImprove a = new AImprove();
        a.func1(1, 4);//相减
        BImprove b = new BImprove();
        b.func1(1, 4);//相加
        b.func3(1, 4);
    }
}

/**
 * Base类应该是要将AB类公有的属性或者方法抽象出来;
 * 如果抽象出来之后B还是依赖于A的话,可以使用聚合,组合的方式;
 */
class Base{
    public int func(){
        return 0;
    }
}

class AImprove extends Base{
    public int func1(int i1, int i2){
        return i1 - i2;
    }
}

class BImprove extends Base{
    //将A作为B的属性,这是组合关系
    AImprove a = new AImprove();

    public int func1(int i1, int i2){
        return i1 + i2;
    }
    public int func2(int i1, int i2){
        return func1(i1 , i2) + 10;
    }
    //实际调用了A的方法;
    public int func3(int i1, int i2){
        return a.func1(i1, i2);
    }
}