package com.walden.javadesignmode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.walden.javadesignmode.activity.FacadeModeActivity;
import com.walden.javadesignmode.activity.FactoryActivity;
import com.walden.javadesignmode.activity.ProxyActivity;
import com.walden.javadesignmode.activity.SingletonModeActivity;
import com.walden.javadesignmode.activity.StragegyActivity;
import com.walden.javadesignmode.adapter.MainPageAdapter;
import com.walden.javadesignmode.bean.StragegyBean;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity {
    public ArrayList<StragegyBean> mData = new ArrayList<>();

    @InjectView(R.id.list)
    public ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        initData();
        initView();
    }

    private void initData() {
        mData.add(new StragegyBean("策略模式", StragegyActivity.class));
        mData.add(new StragegyBean("代理模式", ProxyActivity.class));
        mData.add(new StragegyBean("单例模式", SingletonModeActivity.class));
        mData.add(new StragegyBean("工厂模式", FactoryActivity.class));
        mData.add(new StragegyBean("门面模式", FacadeModeActivity.class));
    }

    private void initView() {
        list.setAdapter(new MainPageAdapter(mData, MainActivity.this));
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, mData.get(position).clazz);
                startActivity(intent);
            }
        });
    }
}
