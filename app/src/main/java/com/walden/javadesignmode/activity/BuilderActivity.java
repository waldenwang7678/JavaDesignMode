package com.walden.javadesignmode.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.walden.javadesignmode.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class BuilderActivity extends AppCompatActivity {
    @InjectView(R.id.description)
    TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);
        ButterKnife.inject(this);
        initView();

    }

    private void initView() {
        description.setText(getResources().getString(R.string.builder_mode));
    }
}
