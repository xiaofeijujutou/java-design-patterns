package com.xiaofei.designpatterns.memento.white_box;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/6/30 22:39
 */


public class RoleStateCaretaker {
    private RoleStatusMemento roleStatusMemento;

    public RoleStatusMemento getRoleStatusMemento() {
        return roleStatusMemento;
    }

    public void setRoleStatusMemento(RoleStatusMemento roleStatusMemento) {
        this.roleStatusMemento = roleStatusMemento;
    }
}
