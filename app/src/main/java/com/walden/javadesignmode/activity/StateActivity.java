package com.walden.javadesignmode.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.walden.javadesignmode.R;
import com.walden.javadesignmode.mode.statemode.MyContext;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class StateActivity extends AppCompatActivity {

    @InjectView(R.id.description)
    TextView description;
    @InjectView(R.id.description_result)
    TextView description_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state);
        ButterKnife.inject(this);

        initView();

    }

    private void initView() {
        description.setText(getString(R.string.state_mode));
    }

    @OnClick(R.id.state_bt1)
    void state_bt1() {
        StringBuilder builder = new StringBuilder();
//        ILift lift = new Lift();
//
//        lift.setState(ILift.STOP_STATE);
//
//        builder.append(lift.open() + "\n"); //开门 进电梯
//        builder.append(lift.close() + "\n");//关门
//        builder.append(lift.run() + "\n");//运行
//        builder.append(lift.stop() + "\n"); //停止
//        builder.append(lift.open() + "\n");  // 开门 出电梯


        MyContext context = new MyContext();
        context.setLifeState(MyContext.closeState);
        builder.append(context.open() + "\n");
        builder.append(context.close() + "\n");
        builder.append(context.run() + "\n");
        builder.append(context.stop() + "\n");
        builder.append(context.open() + "\n");

        description_result.setText(builder.toString());
    }
}
