package com.walden.javadesignmode.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.walden.javadesignmode.R;
import com.walden.javadesignmode.mode.singletonmode.SingletonMode1;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class SingletonModeActivity extends AppCompatActivity {

    @InjectView(R.id.singleton_tv1)
    TextView singleton_tv1;

    @InjectView(R.id.description)
    TextView single_description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton_mode);
        ButterKnife.inject(this);
        initView();
    }

    private void initView() {
        single_description.setText(getString(R.string.single_mode));
    }

    @OnClick(R.id.singleton_bt1)
    void getHashCode() {
        SingletonMode1 mode1 = SingletonMode1.getInstance();
        singleton_tv1.setText(String.valueOf(mode1.hashCode()));
    }
}
