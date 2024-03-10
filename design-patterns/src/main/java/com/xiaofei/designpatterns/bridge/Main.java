package com.xiaofei.designpatterns.bridge;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/10 18:46
 */


public class Main {
    public static void main(String[] args) {
        OpratingSystem win = new WindowsSystem(new RmvbFile());
        win.playVideo("阿亮流哈喇子");
    }
}
