package com.walden.javadesignmode.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.walden.javadesignmode.R;
import com.walden.javadesignmode.mode.proxy.AIPlayGame;
import com.walden.javadesignmode.mode.proxy.DogPlayGame;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class ProxyActivity extends AppCompatActivity {
    @InjectView(R.id.proxy_tv1)
    TextView proxy_tv1;
    @InjectView(R.id.proxy_description)
    TextView proxy_description;
    private AIPlayGame ai;
    private DogPlayGame dog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy);
        ButterKnife.inject(this);
        initView();
    }

    private void initView() {
        proxy_description.setText(getResources().getString(R.string.proxy_description));
    }

    @OnClick(R.id.proxy_bt1)
    void proxy_bt1() {
        if (ai == null) {
            ai = new AIPlayGame();
        }
        if (dog == null) {
            dog = new DogPlayGame(ai);
        }
        proxy_tv1.setText(dog.play());
    }
}
