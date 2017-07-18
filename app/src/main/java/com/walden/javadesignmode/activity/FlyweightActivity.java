package com.walden.javadesignmode.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.walden.javadesignmode.R;
import com.walden.javadesignmode.mode.flyweightmode.XiaomingFactory;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class FlyweightActivity extends AppCompatActivity {

    @InjectView(R.id.description)
    TextView description;
    @InjectView(R.id.flyweight_result)
    TextView flyweight_result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flyweight);
        ButterKnife.inject(this);
        initView();
    }

    private void initView() {
        description.setText(getString(R.string.flyweight_mode));
    }

    @OnClick(R.id.flyweight_bt1)
    void flyweight_bt1() {
        StringBuilder str = new StringBuilder();
        XiaomingFactory factory = new XiaomingFactory();
        str.append(factory.getXiaoming("勇勇").lol() + "\n");
        str.append(factory.getXiaoming("小薇").lol() + "\n");
        str.append(factory.getXiaoming("静静").lol() + "\n");
        str.append(factory.getXiaoming("静静").lol() + "\n");
        str.append(factory.getXiaoming("静静").lol() + "\n");
        str.append("小明的个数：" + factory.getXiaomingSize());
        flyweight_result.setText(str.toString());
    }

}
