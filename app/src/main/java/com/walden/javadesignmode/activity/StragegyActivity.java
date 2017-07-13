package com.walden.javadesignmode.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.walden.javadesignmode.R;
import com.walden.javadesignmode.mode.stragegymode.BlackDoor;
import com.walden.javadesignmode.mode.stragegymode.BlockEnemy;
import com.walden.javadesignmode.mode.stragegymode.GreenLight;
import com.walden.javadesignmode.mode.stragegymode.StragegyManager;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class StragegyActivity extends AppCompatActivity {
    @InjectView(R.id.showtips)
    TextView showtips;
    @InjectView(R.id.description)
    TextView description;
    StragegyManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stragegy);
        ButterKnife.inject(this);
        initView();
    }

    private void initView() {
        description.setText(getResources().getString(R.string.stragegy_description));
    }

    @OnClick(R.id.bt1)
    void bt1() {
        if (manager == null) {
            manager = StragegyManager.getInstance();
        }
        manager.setmStrategy(new BlackDoor());
        showtips.setText(manager.operate());
    }

    @OnClick(R.id.bt2)
    void bt2() {
        if (manager == null) {
            manager = StragegyManager.getInstance();
        }
        manager.setmStrategy(new GreenLight());
        showtips.setText(manager.operate());
    }

    @OnClick(R.id.bt3)
    void bt3() {
        if (manager == null) {
            manager = StragegyManager.getInstance();
        }
        manager.setmStrategy(new BlockEnemy());
        showtips.setText(manager.operate());
    }

}
