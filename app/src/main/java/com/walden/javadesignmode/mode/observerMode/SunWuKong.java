package com.walden.javadesignmode.mode.observerMode;

/**
 * Created by walden on 2017/7/5.
 */

import android.view.SurfaceHolder;

import java.util.ArrayList;

/**
 * 大闹天宫的孙猴子是要被观察的， 作为被观察者
 */

public class SunWuKong implements Observable {

    private Subsciption subsciption;

    private SunWuKong() {

    }

    public static SunWuKong getInstance() {
        return Houzi.wukong;
    }

    //被观察者持有观察者的引用
    private ArrayList<Observer> observers = new ArrayList<>();
    private ArrayList<String> observersName = new ArrayList<>();

    @Override
    public SunWuKong addObserver(Observer observer) {
        if (observersName.contains(observer.getClass().getSimpleName())) {
            return this;
        } else {
            observers.add(observer); //添加观察者
            observersName.add(observer.getClass().getSimpleName());
            return this;
        }


    }

    @Override
    public SunWuKong deleteObserver(Observer observer) {
        if (observersName.contains(observer.getClass().getSimpleName())) {
            observersName.remove(observer.getClass().getSimpleName());
            observers.remove(observer); //移除观察者
        }
        return this;
    }

    @Override
    public void deleteAll() {
        observers.clear(); //移除观察者
        observersName.clear();
    }

    @Override
    public String notifyObserver(String str) {
        StringBuilder builder = new StringBuilder();
        for (Observer o : observers) {              //通知更新观察者
            String result = o.update(str) + "\n";
            builder.append(result);
        }
        return builder.toString();
    }

    public SunWuKong danaotiangong() { //大闹天宫
        subsciption.subscibe(notifyObserver("大闹天宫"));
        return this;
    }

    public SunWuKong baotangseng() {
        subsciption.subscibe(notifyObserver("保唐僧"));
        return this;
    }

    private static class Houzi {
        static SunWuKong wukong = new SunWuKong();
    }

    public interface Subsciption {
        void subscibe(String str);
    }

    public SunWuKong setSubsciption(Subsciption s) {
        this.subsciption = s;
        return this;
    }
}
