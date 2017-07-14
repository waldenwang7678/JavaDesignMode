package com.walden.javadesignmode.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.walden.javadesignmode.R;
import com.walden.javadesignmode.mode.chainmode.Father;
import com.walden.javadesignmode.mode.chainmode.HandlerImp;
import com.walden.javadesignmode.mode.chainmode.Husband;
import com.walden.javadesignmode.mode.chainmode.IHandler;
import com.walden.javadesignmode.mode.chainmode.IWoman;
import com.walden.javadesignmode.mode.chainmode.Son;
import com.walden.javadesignmode.mode.chainmode.Woman;

import java.util.ArrayList;
import java.util.Random;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class ChainActivity extends AppCompatActivity {

    @InjectView(R.id.description)
    TextView description;
    @InjectView(R.id.chain_result)
    TextView chain_result;
    private ArrayList<String> arr;
    private Random rand;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chain);
        ButterKnife.inject(this);
        initView();
    }

    private void initView() {
        description.setText(getString(R.string.chain_mode));
        arr = new ArrayList<>();
        arr.add("我要出去逛街");
        arr.add("我想打LOL");
        arr.add("我要打王者荣耀");
        arr.add("我要去约会");
        arr.add("我要去旅游");
        rand = new Random();
    }

    @OnClick(R.id.chain_bt1)
    void chainbt1() {
        ArrayList<IWoman> arrayList = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            arrayList.add(new Woman(i, arr.get(rand.nextInt(5))));
        }
        HandlerImp father = new Father();
        HandlerImp husband = new Husband();
        HandlerImp son = new Son();

        father.setNext(husband);
        husband.setNext(son);

        StringBuilder builder = new StringBuilder();
        for (IWoman woman : arrayList) {
            builder.append(father.handMessage(woman));
        }
        chain_result.setText(builder.toString());
    }
}
