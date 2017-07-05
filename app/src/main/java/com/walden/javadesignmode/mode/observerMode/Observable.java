package com.walden.javadesignmode.mode.observerMode;

/**
 * Created by walden on 2017/7/5.
 */

public interface Observable {

    public Observable addObserver(Observer observer);

    public Observable deleteObserver(Observer observer);

    public String notifyObserver(String str);

    public void deleteAll();
}
