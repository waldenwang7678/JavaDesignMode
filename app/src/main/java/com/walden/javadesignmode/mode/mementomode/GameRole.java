package com.walden.javadesignmode.mode.mementomode;

/**
 * Created by wangjt on 2017/7/18.
 * 游戏角色 ， 需要备份的对象
 */

public class GameRole {
    private int atk;
    private int vit;

    public void init() {
        atk = 100;
        vit = 100;
    }

    public String show() {
        if (atk == 0 || vit == 0) {
            return "Game Over~";
        }
        return "血量： " + vit + " \n攻击: " + atk;
    }


    public void fightBoss() {
        if (atk == 0 || vit == 0) {
            return;
        }
        atk = atk + 5;
        vit = vit - 10;
    }

    /**
     * 保存数据
     *
     * @return
     */
    public RoleStateMemento saveMemento() {
        return new RoleStateMemento(atk, vit);
    }

    /**
     * 恢复数据
     *
     * @param r
     */
    public void recove(RoleStateMemento r) {
        this.atk = r.getAtk();
        this.vit = r.getVik();
    }

}
