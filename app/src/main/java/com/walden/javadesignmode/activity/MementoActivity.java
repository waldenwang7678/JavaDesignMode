package com.walden.javadesignmode.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.walden.javadesignmode.R;
import com.walden.javadesignmode.mode.mementomode.GameRole;
import com.walden.javadesignmode.mode.mementomode.RoleStateManager;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MementoActivity extends AppCompatActivity {

    @InjectView(R.id.description)
    TextView description;
    @InjectView(R.id.memento_result)
    TextView memento_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memento);
        ButterKnife.inject(this);
        initView();
    }

    private void initView() {
        description.setText(getString(R.string.memento_mode));
    }

    @OnClick(R.id.memento_bt1)
    void menmeto_bt1() {
        GameRole shangjin = new GameRole();
        shangjin.init();
        shangjin.show();
        RoleStateManager adminMange = new RoleStateManager();
        adminMange.setMemento(shangjin.saveMemento());//保存
        shangjin.fightBoss();
        shangjin.show();
        shangjin.recove(adminMange.getMemento());
        shangjin.show();



    }
}
