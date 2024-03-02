package com.xiaofei.designpatterns.dependenceinversion;

/**
 * @Description: Created by IntelliJ IDEA.
 * 依赖倒转原则
 * @Author : 小肥居居头
 * @create 2024/3/2 15:12
 */


public class DependenceInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}
/**
 * 方法参数直接依赖具体的class,也就是依赖具体模块;
 * 如果有多个类型的Email或者多个类型的Person,维护就会变得很麻烦;
 */
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}
class Email{
    public String getInfo(){
        return "emailDetail";
    }
}
