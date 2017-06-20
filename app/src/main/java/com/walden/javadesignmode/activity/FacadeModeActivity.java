package com.walden.javadesignmode.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.walden.javadesignmode.R;
import com.walden.javadesignmode.mode.FacadeMode.MiddleOrganization;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class FacadeModeActivity extends AppCompatActivity {
    @InjectView(R.id.facade_tv)
    TextView facade_tv;
    @InjectView(R.id.facade_description)
    TextView facade_description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facade_mode);
        ButterKnife.inject(this);
        facade_description.setText(getString(R.string.facede_mode));
    }

    @OnClick(R.id.facade_bt1)
    void facade_bt1() {
        String str = MiddleOrganization.sendLetter("今天你好吗", "天涯海角");
        facade_tv.setText(str);
    }
}
