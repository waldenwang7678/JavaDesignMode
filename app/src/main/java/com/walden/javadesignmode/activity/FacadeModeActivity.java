package com.walden.javadesignmode.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.walden.javadesignmode.R;
import com.walden.javadesignmode.mode.facademode.MiddleOrganization;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * 门面模式（外观模式），对事情的执行顺序和内容进行封装A， 用户只需要提供必要的信息
 *  用户只需要跟A交互就可以了， 例子（去餐厅吃饭，只需要跟服务员交互就可以了， 点单， 做饭，结账的事情交给服务员帮忙）
 *  理解方式：门面负责处理所有的事情，使用者只需要跟门面交互
 */
public class FacadeModeActivity extends AppCompatActivity {
    @InjectView(R.id.facade_tv)
    TextView facade_tv;
    @InjectView(R.id.description)
    TextView facade_description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facade_mode);
        ButterKnife.inject(this);
        facade_description.setText(getString(R.string.facede_mode));
    }

    @OnClick(R.id.facade_bt1)
    void facade_bt1() {
        String str = MiddleOrganization.sendLetter("今天你好吗", "天涯海角");
        facade_tv.setText(str);
    }
}
