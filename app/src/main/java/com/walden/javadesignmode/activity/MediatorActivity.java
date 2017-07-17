package com.walden.javadesignmode.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

import com.walden.javadesignmode.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MediatorActivity extends AppCompatActivity {

    @InjectView(R.id.description)
    TextView description;
    @InjectView(R.id.mediator_result)
    TextView mediator_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediator);
        ButterKnife.inject(this);
        initView();
    }

    private void initView() {
        description.setText(Html.fromHtml(getString(R.string.mediator_mode)));
    }

    @OnClick(R.id.mediator_bt1)
    void mediator_bt1() {
        mediator_result.setText("啥都没，别点了");
    }
}
