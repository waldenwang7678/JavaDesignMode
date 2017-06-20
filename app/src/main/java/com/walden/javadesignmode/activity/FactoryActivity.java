package com.walden.javadesignmode.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.walden.javadesignmode.R;
import com.walden.javadesignmode.mode.FactoryMode.Hero;
import com.walden.javadesignmode.mode.FactoryMode.HeroFactory;
import com.walden.javadesignmode.mode.FactoryMode.HuoQiang;
import com.walden.javadesignmode.mode.FactoryMode.LaiEn;
import com.walden.javadesignmode.mode.FactoryMode.LanMao;
import com.walden.javadesignmode.mode.FactoryMode.WuYao;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class FactoryActivity extends AppCompatActivity {
    @InjectView(R.id.show_skill)
    TextView show_skill;
    @InjectView(R.id.factory_description)
    TextView factory_description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);
        ButterKnife.inject(this);
        factory_description.setText(getString(R.string.factory_mode));
    }

    @OnClick(R.id.f_bt1)
    void f_bt1() {
        Hero hero = HeroFactory.createHero(HuoQiang.class);
        show_skill.setText(hero.Skill());
    }

    @OnClick(R.id.f_bt2)
    void f_bt2() {
        Hero hero = HeroFactory.createHero(LaiEn.class);
        show_skill.setText(hero.Skill());
    }

    @OnClick(R.id.f_bt3)
    void f_bt3() {
        Hero hero = HeroFactory.createHero(LanMao.class);
        show_skill.setText(hero.Skill());
    }

    @OnClick(R.id.f_bt4)
    void f_bt4() {
        Hero hero = HeroFactory.createHero(WuYao.class);
        show_skill.setText(hero.Skill());
    }

    @OnClick(R.id.f_bt5)
    void f_bt5() {
        Hero hero = HeroFactory.createHero();
        show_skill.setText(hero.Skill());
    }
}
