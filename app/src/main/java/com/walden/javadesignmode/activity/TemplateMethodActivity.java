package com.walden.javadesignmode.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.walden.javadesignmode.R;
import com.walden.javadesignmode.mode.templatemode.CarH1Model;
import com.walden.javadesignmode.mode.templatemode.CarModel;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class TemplateMethodActivity extends AppCompatActivity {

    @InjectView(R.id.description)
    TextView template_desciption;
    @InjectView(R.id.template_result)
    TextView template_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template_method);
        ButterKnife.inject(this);
        initView();
    }

    private void initView() {
        template_desciption.setText(getResources().getString(R.string.template_mode));

    }

    @OnClick(R.id.template_bt1)
    void templetebt1() {
        CarH1Model car = new CarH1Model();
        car.setAlarm(false);
        template_result.setText(car.run());
    }

    @OnClick(R.id.template_bt2)
    void templetebt2() {
        CarH1Model car2 = new CarH1Model();
        car2.setAlarm(true);
        template_result.setText(car2.run());
    }
}
