package com.walden.javadesignmode.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.walden.javadesignmode.R;
import com.walden.javadesignmode.mode.adaptermode.IUserInfo;
import com.walden.javadesignmode.mode.adaptermode.OutUserInfo;
import com.walden.javadesignmode.mode.adaptermode.UserInfo;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * 适配器模式
 */
public class AdapterActivity extends AppCompatActivity {

    @InjectView(R.id.adapter_tv1)
    TextView adapter_tv1;
    @InjectView(R.id.adapter_tv2)
    TextView adapter_tv2;
    @InjectView(R.id.description)
    TextView adapter_description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);
        ButterKnife.inject(this);
        initView();
    }

    private void initView() {

        adapter_description.setText(getResources().getString(R.string.adapter_mode));

        IUserInfo info = new UserInfo();
        IUserInfo info1 = new OutUserInfo();


        adapter_tv1.setText(info.toString());
        adapter_tv2.setText(info1.toString());
    }
}
