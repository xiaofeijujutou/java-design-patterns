package com.xiaofei.designpatterns.dependenceinversion;

/**
 * @Description: Created by IntelliJ IDEA.
 * 依赖倒转原则,抽象依赖抽象,具体实现通过代码层面选择;
 * 开发过程:已知接口已经有哪些方法了,方法就接收接口,然后按照行为去调用接口的方法
 * @Author : 小肥居居头
 * @create 2024/3/2 15:12
 */
public class DependenceInversionImprove {
    public static void main(String[] args) {
        //接口
        PersonImpl person = new PersonImpl();
        person.receive(new WeixinEmail());
        person.receive(new QQEmail());
        //构造器
        FeedAnimal feedDog = new FeedAnimal(new Dog());
        feedDog.feedAnimal();
        FeedAnimal feedCat = new FeedAnimal(new Cat());
        feedCat.feedAnimal();
        //setter
        CheckPigColor checkPigColor = new CheckPigColor();
        checkPigColor.setPigImpl(new BlackPig());
        System.out.println(checkPigColor.checkPigColor());
        checkPigColor.setPigImpl(new WhitePig());
        System.out.println(checkPigColor.checkPigColor());
    }
}
/**
 * 通过接口实现依赖倒置;
 * 在每次调用方法的时候指定具体实现,最为灵活,但是最为麻烦;
 * 适用需要经常变更具体实现的场景
 */
interface IEmai{
    String getInfo();
}

class WeixinEmail implements IEmai{
    @Override
    public String getInfo() {
        return "weixinEmail";
    }
}

class QQEmail implements IEmai{
    @Override
    public String getInfo() {
        return "QQEmail";
    }
}

class PersonImpl{
    /**
     * 这个方法参数从具体实现类变成了接口,也就是从具体变成了抽象;
     * 具体实现是由开发者来指定;
     * @param email
     */
    public void receive(IEmai email){
        System.out.println(email.getInfo());
    }
}

/**
 * 通过构造器实现依赖倒置;
 * 创建实现类的时候就指定具体实现,最不灵活;
 * 适用一创建就不会变具体实现的场景;
 */
interface Animal{
    void eat();
}

class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("dog.eat()");
    }
}

class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("cat.eat()");
    }
}
class FeedAnimal{
    Animal animal;
    public FeedAnimal(Animal animal){
        this.animal = animal;
    }
    public void feedAnimal(){
        this.animal.eat();
    }
}
/**
 * 通过setter实现依赖倒置;
 * 创建完实现类之后,后续还可能更换具体实现;
 * 属于中间灵活,中途可以修改具体实现;
 */
interface Pig{
    String getColor();
}

class BlackPig implements Pig{
    @Override
    public String getColor() {
        return "black";
    }
}
class WhitePig implements Pig{
    @Override
    public String getColor() {
        return "white";
    }
}

interface EnableChangePigImpl{
    void setPigImpl(Pig pig);
}

class CheckPigColor implements EnableChangePigImpl{
    Pig pig;
    @Override
    public void setPigImpl(Pig pig) {
        this.pig = pig;
    }

    public String checkPigColor(){
        return this.pig.getColor();
    }
}


