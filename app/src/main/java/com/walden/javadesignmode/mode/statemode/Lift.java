package com.walden.javadesignmode.mode.statemode;

/**
 * Created by wangjt on 2017/7/17.
 * 具体状态 /  常规模式，代码冗余， 状态切换时候的逻辑判断
 */

public class Lift implements ILift {


    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String open() {
        String result = "";
        switch (this.state) {
            case OPEN_STATE:
                break;
            case CLOSE_STATE:
                result = this.openWithLogic();
                this.setState(OPEN_STATE);
                break;
            case RUN_STATE:
                //正在运行的， 不能打开门
                break;
            case STOP_STATE:
                result = this.openWithLogic();
                this.setState(OPEN_STATE);
                break;
        }
        return result;
    }

    @Override
    public String close() {
        String result = "";
        switch (this.state) {
            case OPEN_STATE:
                result = this.closeWithoutLogic();
                this.setState(CLOSE_STATE);
                break;
            case CLOSE_STATE:

                break;
            case RUN_STATE:

                break;
            case STOP_STATE:

                break;
            default:
                result = "";

        }
        return result;
    }


    @Override
    public String run() {
        String result = "";
        switch (this.state) {
            case OPEN_STATE:
                break;
            case CLOSE_STATE:
                result = this.runWithLogic();
                this.setState(RUN_STATE);
                break;
            case RUN_STATE:

                break;
            case STOP_STATE:
                result =  this.runWithLogic();
                 this.setState(RUN_STATE);
                break;
        }
        return result;
    }

    @Override
    public String stop() {
        String result = "";
        switch (this.state) {
            case OPEN_STATE:
                // 门打开  需要先关门再停止
                break;
            case CLOSE_STATE:
                result = this.stopWithLogic();
                this.setState(CLOSE_STATE);
                break;
            case RUN_STATE:
                result =  this.stopWithLogic();
                this.setState(CLOSE_STATE);
                break;
            case STOP_STATE:
                break;
        }
        return result;
    }

    private String closeWithoutLogic() {
        return ("电梯门关闭...");
    }

    private String openWithLogic() {
        return ("电梯开门");
    }

    private String runWithLogic() {
        return "电梯上下动起来";
    }

    private String stopWithLogic() {
        return "电梯正常停止";
    }
}

