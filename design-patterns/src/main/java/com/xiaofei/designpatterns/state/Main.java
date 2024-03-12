package com.xiaofei.designpatterns.state;

import com.xiaofei.designpatterns.state.nodesign.ILift;
import com.xiaofei.designpatterns.state.nodesign.Lift;

import java.util.Scanner;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/12 16:49
 */


public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        //默认是关闭状态;
        context.setCurrentState(StateConstants.STOPPING_STATE);
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1打开电梯门,2关闭电梯门,3启动电梯,4关闭电梯");
            int op = scanner.nextInt();
            switch (op) { //当前电梯状态
                case 1 :
                    context.open();
                    break;
                case 2 :
                    context.close();
                    break;
                case 3 :
                    context.run();
                    break;
                case 4 :
                    context.stop();
                    break;
            }
        }while (true);
    }






    public static void nodesign(){
        //创建电梯对象
        Lift lift = new Lift();

        //设置当前电梯的状态
        lift.setState(ILift.RUNNING_STATE);

        //打开
        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }
}
