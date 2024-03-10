package com.xiaofei.designpatterns.decorator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/10 15:37
 */


public class Main {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("C");
            BufferedWriter bufferedWriter = new BufferedWriter(fw);
            bufferedWriter = new BufferedWriter(bufferedWriter);
            bufferedWriter = new BufferedWriter(bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }



        FriedRice friedRice = new FriedRice();
        System.out.println(friedRice.getDesc() + " 价格:" + friedRice.cost());
        Egg egg = new Egg(friedRice);
        System.out.println(egg.getDesc() + " 价格:" + egg.cost());
        egg = new Egg(egg);
        System.out.println(egg.getDesc() + " 价格:" + egg.cost());
        System.out.println("======================>>>");
        FastFood friedRiceDe0 = new FriedRice();
        System.out.println(friedRiceDe0.getDesc() + " 价格:" + friedRiceDe0.cost());
        FastFood friedRiceDe1 = new Egg(friedRiceDe0);
        System.out.println(friedRiceDe1.getDesc() + " 价格:" + friedRiceDe1.cost());
        FastFood friedRiceDe2 = new Egg(friedRiceDe1);
        System.out.println(friedRiceDe2.getDesc() + " 价格:" + friedRiceDe2.cost());
    }
}
