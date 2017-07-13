package com.walden.javadesignmode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.walden.javadesignmode.activity.AdapterActivity;
import com.walden.javadesignmode.activity.BridgeActivity;
import com.walden.javadesignmode.activity.BuilderActivity;
import com.walden.javadesignmode.activity.CommandActivity;
import com.walden.javadesignmode.activity.CompositeActivity;
import com.walden.javadesignmode.activity.DecoratorActivity;
import com.walden.javadesignmode.activity.FacadeModeActivity;
import com.walden.javadesignmode.activity.FactoryActivity;
import com.walden.javadesignmode.activity.IteratorActivity;
import com.walden.javadesignmode.activity.ObserverActivity;
import com.walden.javadesignmode.activity.ProxyActivity;
import com.walden.javadesignmode.activity.SingletonModeActivity;
import com.walden.javadesignmode.activity.StragegyActivity;
import com.walden.javadesignmode.activity.TemplateMethodActivity;
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
        mData.add(new StragegyBean("适配器模式", AdapterActivity.class));
        mData.add(new StragegyBean("观察者模式", ObserverActivity.class));
        mData.add(new StragegyBean("模板方法模式", TemplateMethodActivity.class));
        mData.add(new StragegyBean("建造者模式", BuilderActivity.class));
        mData.add(new StragegyBean("桥梁模式", BridgeActivity.class));
        mData.add(new StragegyBean("命令模式", CommandActivity.class));
        mData.add(new StragegyBean("装饰模式", DecoratorActivity.class));
        mData.add(new StragegyBean("迭代器模式", IteratorActivity.class));
        mData.add(new StragegyBean("组合模式", CompositeActivity.class));
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
