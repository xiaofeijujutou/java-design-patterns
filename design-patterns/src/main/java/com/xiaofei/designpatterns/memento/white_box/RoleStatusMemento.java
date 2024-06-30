package com.xiaofei.designpatterns.memento.white_box;

/**
 * @Description: Created by IntelliJ IDEA.
 * 备忘录角色类,可以是一个,也可以是list存多个;
 * @Author : 小肥居居头
 * @create 2024/6/30 22:33
 */


public class RoleStatusMemento {
    private int atk; // 攻击力
    private int def; // 攻击力
    private int vit; // 生命值

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public RoleStatusMemento(int atk, int def, int vit) {
        this.atk = atk;
        this.def = def;
        this.vit = vit;
    }

    public RoleStatusMemento() {

    }
}
