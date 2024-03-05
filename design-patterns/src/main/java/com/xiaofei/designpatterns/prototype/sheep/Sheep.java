package com.xiaofei.designpatterns.prototype.sheep;


import java.io.*;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Objects;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/5 17:42
 */


public class Sheep implements Cloneable, Serializable {

    private String name;
    private String color;
    private Integer age;
    //引用数据类型不会复制里面的所有属性,而是复制有引用地址;
    public Sheep friend;


    public Sheep() {
        this.name = "默认";
        this.color = "默认";
        this.age = 0;
    }

    public Sheep(String name, String color, Integer age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }


    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", friend=" + friend +
                '}';
    }

    //.clone就是把所有的属性用=赋值一遍,如果属性是引用数据类型,
    //那就指向了同一片地址;
    @Override
    public Sheep clone() {
        try {
            Sheep sheep = (Sheep) super.clone();
            sheep.friend = friend.clone();
            return sheep;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Sheep deepCloneBySerializable() {
        try {
            //TODO 学习jdk自带的流;
            //序列化,把Java对象转换成字节数组;
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            //反序列化,把字节数组转换成对象;
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Sheep deepCloneSheep = (Sheep)ois.readObject();
            return deepCloneSheep;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //关流
        }
        return null;
    }
}
