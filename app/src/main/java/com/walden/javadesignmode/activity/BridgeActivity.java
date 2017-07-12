package com.walden.javadesignmode.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.walden.javadesignmode.R;
import com.walden.javadesignmode.mode.bridgemode.abstractpart.DriverManager;
import com.walden.javadesignmode.mode.bridgemode.implementpart.MySqlDriver;
import com.walden.javadesignmode.mode.bridgemode.implementpart.OracleDriver;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class BridgeActivity extends AppCompatActivity {

    @InjectView(R.id.description)
    TextView description;

    @InjectView(R.id.bridge_result)
    TextView bridge_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bridge);
        ButterKnife.inject(this);
        initView();
    }

    private void initView() {
        description.setText(Html.fromHtml(getString(R.string.bridge_mode)));

        DriverManager manager = new DriverManager(new MySqlDriver());
        String str1 = manager.getConnection();

        manager = new DriverManager(new OracleDriver());
        String str2 = manager.getConnection();

        bridge_result.setText(str1 + "\n" + str2);
    }
}
