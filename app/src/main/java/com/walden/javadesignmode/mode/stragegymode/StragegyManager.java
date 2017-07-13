package com.walden.javadesignmode.mode.stragegymode;

/**
 * Created by Administrator on 2017/6/13 0013.
 */

public class StragegyManager {
    private IStrategy mStrategy;

    private StragegyManager() {
    }

    public static StragegyManager getInstance() {
        return StragegyManagerImp.mStrategy;
    }

    public String operate() {
        return mStrategy.operate();
    }

    public void setmStrategy(IStrategy iStrategy) {
        mStrategy = iStrategy;
    }

    public static class StragegyManagerImp {
        public static StragegyManager mStrategy = new StragegyManager();
    }

}
