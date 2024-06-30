package com.xiaofei.designpatterns.memento.white_box;

import java.util.Random;

/**
 * @Description: Created by IntelliJ IDEA.
 * 游戏角色类(发起人角色,玩家)
 * @Author : 小肥居居头
 * @create 2024/6/30 22:18
 */


public class GameRole {
    private int atk; // 攻击力
    private int def; // 攻击力
    private int vit; // 生命值
    private Random random = new Random();

    /**
     * 初始化游戏角色状态
     */
    public void initState() {
        this.atk = 100;
        this.def = 100;
        this.vit = 100;
    }

    /**
     * 战斗
     */
    public void fight() {
        int damage = Math.abs(random.nextInt(10));
        this.vit -= ((damage * 50) / def) + 1;
        def -= damage;
        atk += damage;
    }

    /**
     * 保存状态
     * @return
     */
    public RoleStatusMemento saveState() {
        return new RoleStatusMemento(atk, def, vit);
    }

    public void recoverState(RoleStatusMemento roleStatusMemento) {
        this.atk = roleStatusMemento.getAtk();
        this.def = roleStatusMemento.getDef();
        this.vit = roleStatusMemento.getVit();
    }
    public String display() {
        return "角色攻击力:" + atk +
                ", 角色防御力:" + def +
                ", 角色生命值:" + vit ;
    }

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
}
