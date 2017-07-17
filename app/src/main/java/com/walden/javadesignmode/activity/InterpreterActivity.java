package com.walden.javadesignmode.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.walden.javadesignmode.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class InterpreterActivity extends AppCompatActivity {

    @InjectView(R.id.description)
    TextView description;
    @InjectView(R.id.interpreter_result)
    TextView interpreter_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interpreter);
        ButterKnife.inject(this);
        initView();

    }

    private void initView() {
        description.setText(getString(R.string.interpreter_mode));
    }

    @OnClick(R.id.interpreter_bt1)
    void interpreter_bt1() {

    }
}
