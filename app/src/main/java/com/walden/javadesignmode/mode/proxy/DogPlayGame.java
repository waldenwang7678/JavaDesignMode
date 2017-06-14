package com.walden.javadesignmode.mode.proxy;

/**
 * Created by Administrator on 2017/6/13 0013.
 */

public class DogPlayGame implements PlayGame {
    AIPlayGame aI;

    public DogPlayGame(AIPlayGame ai) {
        aI = ai;
    }

    @Override
    public String play() {
        return aI.play();
    }
}
