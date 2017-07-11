package com.walden.javadesignmode.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.walden.javadesignmode.R;
import com.walden.javadesignmode.mode.observermode.GuanYin;
import com.walden.javadesignmode.mode.observermode.RuLai;
import com.walden.javadesignmode.mode.observermode.SunWuKong;
import com.walden.javadesignmode.mode.observermode.YuDi;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class ObserverActivity extends AppCompatActivity {

    @InjectView(R.id.description)
    TextView description;
    @InjectView(R.id.observer_result)
    TextView observer_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);
        ButterKnife.inject(this);
        initView();
    }

    private void initView() {
        description.setText(getResources().getString(R.string.observer_mode));
    }

    @OnClick(R.id.observer_bt1)
    void bt1() {
        SunWuKong.getInstance()
                .addObserver(new GuanYin())
                .addObserver(new RuLai())
                .addObserver(new YuDi())
                .setSubsciption(new SunWuKong.Subsciption() {   //返回观察者处理的结果
                    @Override
                    public void subscibe(String str) {
                        observer_result.setText(str);
                    }
                })
                .danaotiangong()//事件触发
                .deleteAll();

    }

    @OnClick(R.id.observer_bt2)
    void bt2() {
        SunWuKong.getInstance()
                .addObserver(new GuanYin())
                .addObserver(new RuLai())
                .setSubsciption(new SunWuKong.Subsciption() {
                    @Override
                    public void subscibe(String str) {
                        observer_result.setText(str);
                    }
                })
                .baotangseng()
                .deleteAll();

    }

}
