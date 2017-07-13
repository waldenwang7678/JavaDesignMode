package com.walden.javadesignmode.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.walden.javadesignmode.R;
import com.walden.javadesignmode.mode.compositemode.Branch;
import com.walden.javadesignmode.mode.compositemode.ICorp;
import com.walden.javadesignmode.mode.compositemode.Leaf;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class CompositeActivity extends AppCompatActivity {

    @InjectView(R.id.description)
    TextView description;
    @InjectView(R.id.composite_result)
    TextView composite_result;

    private Branch ceo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_composite);
        ButterKnife.inject(this);
        init();
        initView();
    }

    private void init() {
        ceo = compositeCorpTree();    //添加数据
    }

    private String getTreeInfo(Branch ceo) {
        StringBuilder info = new StringBuilder();
        ArrayList<ICorp> subordinate = ceo.getSubordinate();
        for (ICorp c : subordinate) {
            if (c instanceof Leaf) {
                info.append(c.getInfo());
            } else {
                info.append(c.getInfo()+getTreeInfo((Branch) c));
            }
        }
        return info.toString();
    }

    private Branch compositeCorpTree() {
        Branch root = new Branch("大头", "总舵主", "王者");
        Branch delelopDep = new Branch("山猫", "堂主", "大师");
        Branch salesDep = new Branch("瘸子", "副舵", "大师");
        Branch financeDep = new Branch("若水", "国师", "大师");

        Branch dep1 = new Branch("路人甲", "普通", "铂金");
        Branch dep2 = new Branch("路人乙", "普通", "铂金");

        Leaf a = new Leaf("a", "酱油", "白银");
        Leaf b = new Leaf("b", "酱油", "白银");
        Leaf c = new Leaf("c", "酱油", "白银");
        Leaf d = new Leaf("d", "酱油", "白银");
        Leaf e = new Leaf("e", "酱油", "白银");
        Leaf f = new Leaf("f", "酱油", "白银");
        Leaf g = new Leaf("g", "酱油", "白银");


        Leaf q1 = new Leaf("二狗", "酱油", "黄金");
        Leaf q2 = new Leaf("电饭锅", "酱油", "黄金");
        Leaf s1 = new Leaf("撒得分", "酱油", "黄金");

        Leaf gold = new Leaf("使者", "酱油", "黄金");

        root.addSubordinate(delelopDep);
        root.addSubordinate(salesDep);
        root.addSubordinate(financeDep);

        delelopDep.addSubordinate(dep1);
        delelopDep.addSubordinate(dep2);
        delelopDep.addSubordinate(gold);

        salesDep.addSubordinate(q1);
        salesDep.addSubordinate(q2);
        financeDep.addSubordinate(s1);


        dep1.addSubordinate(a);
        dep1.addSubordinate(b);
        dep1.addSubordinate(c);
        dep2.addSubordinate(d);
        dep2.addSubordinate(e);
        dep2.addSubordinate(f);
        dep2.addSubordinate(g);

        return root;
    }

    private void initView() {
        description.setText(getString(R.string.composite_mode));
    }


    @OnClick(R.id.composite_bt1)
    void bt1() {
        StringBuilder info = new StringBuilder();
        info.append(ceo.getInfo());
        info.append(getTreeInfo(ceo));
        composite_result.setText(info.toString());
    }

}
