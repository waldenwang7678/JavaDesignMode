package com.walden.javadesignmode.mode.singletonmode;

/**
 * Created by Administrator on 2017/6/13 0013.
 * <p>
 * 可以实现多例模式(例如两个) ,类初始化时在集合中添加两个实例, 可以随机的取某一个实例, 或者取某一个固定的实例
 */

public class SingletonMode1 {
    private static SingletonMode1 mode;  //懒汉式
    private static SingletonMode1 mode1 = new SingletonMode1();  //恶汉式

    private SingletonMode1() {
    }

    public static SingletonMode1 getInstance() {
        if (mode == null) {
            mode = new SingletonMode1();
        }
        return mode;
//        return mode1;
    }

}
