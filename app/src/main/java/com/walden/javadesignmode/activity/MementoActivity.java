package com.walden.javadesignmode.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.walden.javadesignmode.R;
import com.walden.javadesignmode.mode.mementomode.GameRole;
import com.walden.javadesignmode.mode.mementomode.RoleStateManager;
import com.walden.javadesignmode.utils.utils;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MementoActivity extends AppCompatActivity {

    @InjectView(R.id.description)
    TextView description;
    @InjectView(R.id.memento_result)
    TextView memento_result;
    private GameRole shangjin;
    private RoleStateManager adminMange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memento);
        ButterKnife.inject(this);
        initView();
        init();
    }

    private void init() {
        shangjin = new GameRole();
        shangjin.init();     //初始化
        adminMange = new RoleStateManager();
        adminMange.setMemento(shangjin.saveMemento());//保存初始化时候的状态

    }

    private void initView() {
        description.setText(getString(R.string.memento_mode));
    }

    @OnClick(R.id.memento_bt1)
        //当前状态
    void menmeto_bt1() {
        memento_result.setText(shangjin.show());
    }

    @OnClick(R.id.memento_bt2)
        //打怪
    void menmeto_bt2() {
        shangjin.fightBoss();
        memento_result.setText(shangjin.show());
    }

    @OnClick(R.id.memento_bt3)
        //满血回复
    void menmeto_bt3() {
        shangjin.recove(adminMange.getMemento());
        memento_result.setText(shangjin.show());
    }
}
