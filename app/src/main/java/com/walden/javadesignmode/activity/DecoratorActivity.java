package com.walden.javadesignmode.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.walden.javadesignmode.R;
import com.walden.javadesignmode.mode.decoratormode.DecorateFiveGradeReport;
import com.walden.javadesignmode.mode.decoratormode.FiveGradeReport;
import com.walden.javadesignmode.mode.decoratormode.HightScoreDecorator;
import com.walden.javadesignmode.mode.decoratormode.SchoolReport;
import com.walden.javadesignmode.mode.decoratormode.SortDecorator;
import com.walden.javadesignmode.utils.S;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class DecoratorActivity extends AppCompatActivity {

    @InjectView(R.id.description)
    TextView description;
    @InjectView(R.id.decorator_result)
    TextView decorator_result;
    private SchoolReport report;
    private SchoolReport decorateReport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decorator);
        ButterKnife.inject(this);
        initView();

    }

    private void initView() {
        description.setText(getString(R.string.decorator_mode));
        if (report == null) {
            report = new FiveGradeReport();
        }
        decorator_result.setText(report.report() + report.sign("愤怒的鲁班"));

    }

    @OnClick(R.id.deccorator_bt1)
    void bt1() {
        decorateReport = new FiveGradeReport();
        decorateReport = new HightScoreDecorator(decorateReport);
        decorateReport = new SortDecorator(decorateReport);
        decorator_result.setText(decorateReport.report() + decorateReport.sign("分数不错嘛,忽悠谁呢~"));
    }

    @OnClick(R.id.deccorator_bt2)
    void bt2() {
        if (report == null) {
            report = new FiveGradeReport();
        }
        decorator_result.setText(report.report() + report.sign("愤怒的鲁班"));
    }
}
