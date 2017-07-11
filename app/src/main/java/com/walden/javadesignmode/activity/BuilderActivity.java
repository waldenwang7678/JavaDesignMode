package com.walden.javadesignmode.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.walden.javadesignmode.R;
import com.walden.javadesignmode.mode.buildermode.person.Man;
import com.walden.javadesignmode.mode.buildermode.person.ManBuilder;
import com.walden.javadesignmode.mode.buildermode.person.PersonBuilder;
import com.walden.javadesignmode.mode.buildermode.person.PersonDerector;
import com.walden.javadesignmode.mode.buildermode.person.Woman;
import com.walden.javadesignmode.mode.buildermode.person.WomanBuilder;
import com.walden.javadesignmode.mode.buildermode.product.Builder;
import com.walden.javadesignmode.mode.buildermode.product.ConcreteBuilder;
import com.walden.javadesignmode.mode.buildermode.product.Director;
import com.walden.javadesignmode.mode.buildermode.product.Product;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class BuilderActivity extends AppCompatActivity implements View.OnClickListener {
    @InjectView(R.id.description)
    TextView description;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);
        ButterKnife.inject(this);
        initView();

    }

    private void initView() {
        description.setText(getResources().getString(R.string.builder_mode));

        result = (TextView) findViewById(R.id.builder_result);
        findViewById(R.id.builder_product).setOnClickListener(this);
        findViewById(R.id.builder_person).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.builder_product:
                buildProduct();
                break;
            case R.id.builder_person:
                buildPerson();
                break;
        }
    }

    private void buildProduct() {
        Builder builder = new ConcreteBuilder();   // 成员变量 创建产品
        new Director(builder).construct();         //产品引用传递到另一个类中 并 开始创建
        Product product = builder.build();         //返回产品
        result.setText(product.getPart1() + "\n" + product.getPart2());
    }

    private void buildPerson() {
        ManBuilder manBuilder = new ManBuilder();    //具体构建实现
        WomanBuilder womanBuilder = new WomanBuilder();    //具体构建实现


        new PersonDerector(manBuilder).construct();    //构建算法 (顺序)
        new PersonDerector(womanBuilder).construct();    //构建算法 (顺序)


        Man man = manBuilder.buildPerson();            //返回结果
        Woman woman = womanBuilder.buildPerson();

        result.setText("man:\n "+man.toString() + "\n\nwoman\n" + woman.toString());
    }
}
