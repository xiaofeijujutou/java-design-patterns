package com.xiaofei.designpatterns.singleresponsibility;

/**
 * @Description: Created by IntelliJ IDEA.
 * 单一接口职责,如果一个类要完成多个功能且重叠,解决方法之一就是抽象成接口,方便拓展;
 * 另一个解决方法是一个类里面写三个方法,没有违反了单一职责,但是开发更简明;
 * @Author : 小肥居居头
 * @create 2024/3/2 12:59
 */


public class SingleResponsibility {
    public static void main(String[] args) {
        Vehicle vehicle0 = new RoadVehicle();
        Vehicle vehicle1 = new SeaVehicle();
        Vehicle vehicle2 = new AirVehicle();
    }
}

/**
 * 以类的拆解完成单一接口职责;
 */
interface Vehicle{
    void run(String vehicle);
}

class RoadVehicle implements Vehicle{
    @Override
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑");
    }
}

class AirVehicle implements Vehicle{
    @Override
    public void run(String vehicle) {
        System.out.println(vehicle + "在天空上飞");
    }
}

class SeaVehicle implements Vehicle{
    @Override
    public void run(String vehicle) {
        System.out.println(vehicle + "在水中上跑");
    }
}

/**
 * 以方法的拆解完成单一接口职责
 */
class MultipleVehicle {
    public void runRoad(String vehicle) {
        System.out.println(vehicle + "在公路上跑");
    }
    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天空上飞");
    }
    public void runSea(String vehicle) {
        System.out.println(vehicle + "在水中上跑");
    }
}


//    没有遵循单一职责原则:
//    class Vehicle{
//        public void run(String vehicle){
//            System.out.println(vehicle + "在公路上跑");
//        }
//    }