package com.walden.javadesignmode.mode.mementomode;

/**
 * Created by wangjt on 2017/7/18.
 * 管理备忘录
 */

public class RoleStateManager {
    RoleStateMemento memento;

    public RoleStateMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }
}
