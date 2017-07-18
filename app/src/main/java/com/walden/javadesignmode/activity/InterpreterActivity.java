package com.walden.javadesignmode.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;

import com.walden.javadesignmode.R;
import com.walden.javadesignmode.mode.interpretermode.Calculator;
import com.walden.javadesignmode.utils.utils;

import java.util.regex.Pattern;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class InterpreterActivity extends AppCompatActivity {

    @InjectView(R.id.description)
    TextView description;
    @InjectView(R.id.interpreter_result)
    TextView interpreter_result;

    @InjectView(R.id.interpreter_et)
    EditText interpreter_et;

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
        String expStr = getExpStr();
        if (expStr.length() == 0) {
            utils.toast(this, "请输入表达式");
            return;
        }
        if (!check(expStr)) {
            utils.toast(this, "请输入正确的表达式~");
            return;
        }
        int result = new Calculator(expStr).run();
        interpreter_result.setText("结果是： " + result);
    }

    public String getExpStr() {
        String str = interpreter_et.getText().toString().trim();
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str;
    }

    private boolean check(String str) {
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            boolean r1 = (Pattern.compile("\\d").matcher(s).matches());
            boolean r2 = s.equals("+");
            boolean r3 = s.equals("-");
            boolean result = r1 || r2 || r3;
            if (!result) {
                return false;
            }
        }
        return true;
    }
}
