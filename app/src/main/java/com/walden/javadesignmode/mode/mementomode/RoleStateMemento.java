package com.walden.javadesignmode.mode.mementomode;

/**
 * Created by wangjt on 2017/7/18.
 * 保存备忘录
 */

public class RoleStateMemento {
    int atk;
    int vik;

    public RoleStateMemento(int atk, int vik) {
        this.atk = atk;
        this.vik = vik;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getVik() {
        return vik;
    }

    public void setVik(int vik) {
        this.vik = vik;
    }
}
