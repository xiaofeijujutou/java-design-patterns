package com.xiaofei.designpatterns.prototype;

import com.xiaofei.designpatterns.prototype.sheep.Sheep;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/5 17:41
 */


public class ProtoType {
    public static void main(String[] args) {
        //origin();
        protoType();
    }

    /**
     * 手动深拷贝;
     */
    public static void origin(){
        Sheep sheep = new Sheep("多莉", "白色", 5);
        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getColor(), sheep.getAge());
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getColor(), sheep.getAge());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getColor(), sheep.getAge());
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
    }

    public static void protoType(){
        Sheep sheep = new Sheep("多莉", "白色", 5);
        Sheep friend = new Sheep();
        sheep.friend = friend;
        Sheep sheep1 = sheep.clone();
        Sheep sheep2 = sheep.clone();
        Sheep sheep3 = sheep.clone();

        sheep.friend.setAge(110);
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep == sheep1);
    }
}
