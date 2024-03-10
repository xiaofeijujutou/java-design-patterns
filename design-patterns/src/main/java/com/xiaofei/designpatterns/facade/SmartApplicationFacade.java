package com.xiaofei.designpatterns.facade;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/10 19:34
 */


public class SmartApplicationFacade {
    private AirCondition airCondition;
    private Computer computer;
    private Light light;
    private TV tv;



    public SmartApplicationFacade() {
        this.airCondition = new AirCondition();
        this.computer = new Computer();
        this.light = new Light();
        this.tv = new TV();
    }

    public void say(String message){
        analysis(message);
    }

    private void analysis(String message) {
        if (message.contains("空调")){
            operateAirCondition(message);
        }
        if (message.contains("电视")){
            operateTV(message);
        }
        if (message.contains("电脑")){
            operateComputer(message);
        }
        if (message.contains("灯")){
            operateLight(message);
        }
    }

    private void operateLight(String message) {
        if (message.contains("打开")){
            light.lightOn();
        }
        else if (message.contains("关闭")){
            light.lightOff();
        }
        else{
            System.out.println("未知灯泡操作");
        }
    }

    private void operateComputer(String message) {
        if (message.contains("打开")){
           computer.computerOn();
        }
        else if (message.contains("关闭")){
            computer.computerOff();
        }
        else{
            System.out.println("未知电脑操作");
        }
    }

    private void operateTV(String message) {
        if (message.contains("打开")){
            tv.TVOn();
        }
        else if (message.contains("关闭")){
            tv.TVOff();
        }
        else{
            System.out.println("未知电视操作");
        }
    }

    private void operateAirCondition(String message) {
        if (message.contains("打开")){
            airCondition.airConditionOn();
        }
        else if (message.contains("关闭")){
            airCondition.airConditionOff();
        }
        else{
            System.out.println("未知空调操作");
        }
    }


    public void openAllMachine(){
        airCondition.airConditionOn();
        computer.computerOn();
        light.lightOn();
        tv.TVOn();
    }

    public void offAllMachine(){
        airCondition.airConditionOff();
        computer.computerOff();
        light.lightOff();
        tv.TVOff();
    }

    public void openSomeMachine(int i){
        if (i == 1){
            airCondition.airConditionOn();
            computer.computerOn();
        }
        if (i == 2){
            light.lightOn();
            tv.TVOn();
        }

    }

    public void offSomeMachine(int i){
        if (i == 1){
            airCondition.airConditionOff();
            computer.computerOff();
        }
        if (i == 2){
            light.lightOff();
            tv.TVOff();
        }

    }
}
