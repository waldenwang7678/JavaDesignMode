package com.walden.javadesignmode.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.walden.javadesignmode.R;
import com.walden.javadesignmode.mode.visitormode.member.CommonEmployee;
import com.walden.javadesignmode.mode.visitormode.member.Employee;
import com.walden.javadesignmode.mode.visitormode.member.Manager;
import com.walden.javadesignmode.mode.visitormode.visite.Visitor;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class VisitorActivity extends AppCompatActivity {

    @InjectView(R.id.description)
    TextView description;
    @InjectView(R.id.visitor_result)
    TextView visitor_result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitor);
        ButterKnife.inject(this);
        initView();
    }

    private void initView() {

        description.setText(getString(R.string.visitor_mode));
    }

    @OnClick(R.id.visitor_bt1)
    void visitorbt1() {
        StringBuilder info = new StringBuilder();
        for (Employee e : getEmployee()) {
            info.append(e.accept(new Visitor()));   //传入一个visitor, 然后将当前对象传入visitor经行访问
        }
        visitor_result.setText(info.toString());
    }

    private ArrayList<Employee> getEmployee() {
        ArrayList<Employee> list = new ArrayList<>();
        CommonEmployee houzi = new CommonEmployee();
        houzi.setName("猴子");
        houzi.setSex(Employee.MALE);
        houzi.setSalsry(800);
        houzi.setJob("苦逼砖工");

        CommonEmployee huamao = new CommonEmployee();
        huamao.setName("花猫");
        huamao.setSex(Employee.FEMALE);
        huamao.setSalsry(700);
        huamao.setJob("苦逼文案狗");

        Manager manager = new Manager();
        manager.setName("刀疤");
        manager.setSalsry(900);
        manager.setSex(Employee.MALE);
        manager.setPerformance("业绩负值也不怂");
        list.add(houzi);
        list.add(huamao);
        list.add(manager);

        return list;
    }
}
