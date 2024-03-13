package com.xiaofei.designpatterns.iterator;

/**
 * @Description: Created by IntelliJ IDEA.
 * 学生的实体类
 * @Author : 小肥居居头
 * @create 2024/3/13 16:54
 */


public class Student {
    private String name;
    //学号
    private int num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Student(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}
