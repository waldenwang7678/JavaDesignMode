package com.walden.javadesignmode.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.walden.javadesignmode.R;
import com.walden.javadesignmode.mode.prototypemode.Mail;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class PrototypeActivity extends AppCompatActivity {

    @InjectView(R.id.description)
    TextView description;

    @InjectView(R.id.prototype_result)
    TextView prototype_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prototype);
        ButterKnife.inject(this);
        initView();
    }

    private void initView() {
        description.setText(getString(R.string.prototype_mode));
    }

    @OnClick(R.id.prototype_bt1)
    void prototype_bt1() {
        StringBuilder str = new StringBuilder();
        Mail mail = new Mail();
        for (int i = 0; i < 5; i++) {
            Mail mailClone = (Mail) mail.clone();  //对象复制
            mailClone.setAddress("地址" + i);
            mailClone.setTitle("标题" + i);
            mailClone.setContent("内容" + i);
            str.append(mailClone.send() + "\n");
        }
        prototype_result.setText(str.toString());
    }
}
