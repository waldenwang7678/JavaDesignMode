package walden.com.javadesignmode.mode.singleton;

/**
 * Created by Administrator on 2017/6/13 0013.
 *
 * 静态内部内实现单例 , 静态内部类只加载一次
 */

public class SingletonMode2 {

    private SingletonMode2() {
    }

    public SingletonMode2 getInstance() {
        return SingletonModeImp.mode2;
    }

    private static class SingletonModeImp {
        public static SingletonMode2 mode2 = new SingletonMode2();
    }

}
