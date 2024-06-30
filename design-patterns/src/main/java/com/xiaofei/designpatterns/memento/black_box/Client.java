package com.xiaofei.designpatterns.memento.black_box;



import java.util.Scanner;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/6/30 22:40
 */


public class Client {
    public static void main(String[] args) throws Exception{


        Scanner scanner = new Scanner(System.in);
        GameRole gameRole = new GameRole();
        gameRole.initState();
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        while (true){
            System.out.println("输入1进行战斗,2查看状态,3保存状态,4恢复状态,0退出");
            int i = scanner.nextInt();
            if (i == 1){
                gameRole.fight();
                System.out.println(gameRole.display());
            }else if (i == 2){
                System.out.println(gameRole.display());
            }else if (i == 3){
                roleStateCaretaker.setMemento(gameRole.saveState());
            }else if (i == 4){
                gameRole.recoverState(roleStateCaretaker.getMemento());
            }else if (i == 0){
                break;
            }
        }
    }

}
