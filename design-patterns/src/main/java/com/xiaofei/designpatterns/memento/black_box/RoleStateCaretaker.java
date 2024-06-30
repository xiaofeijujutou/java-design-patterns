package com.xiaofei.designpatterns.memento.black_box;

import com.xiaofei.designpatterns.memento.white_box.RoleStatusMemento;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/6/30 22:39
 */


public class RoleStateCaretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
