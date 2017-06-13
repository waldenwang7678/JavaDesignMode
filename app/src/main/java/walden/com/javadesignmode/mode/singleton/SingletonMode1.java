package walden.com.javadesignmode.mode.singleton;

/**
 * Created by Administrator on 2017/6/13 0013.
 */

public class SingletonMode1 {
    private SingletonMode1 mode;  //懒汉式
    private SingletonMode1 mode1 = new SingletonMode1();  //恶汉式

    private SingletonMode1() {
    }

    public SingletonMode1 getInstance() {
        if (mode == null) {
            mode = new SingletonMode1();
        }
        return mode;
//        return mode1;
    }


}
