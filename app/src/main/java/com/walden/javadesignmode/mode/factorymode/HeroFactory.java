package com.walden.javadesignmode.mode.factorymode;

import android.util.Log;

import com.walden.javadesignmode.utils.S;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by Administrator on 2017/6/20 0020.
 */

public class HeroFactory {
    static ArrayList<Class> classList;
    static HashMap<String, Hero> heroMap = new HashMap<>();

    public static Hero createHero(Class c) {
        Hero hero = null;

        if (heroMap.containsValue(c.getSimpleName())) {
            return heroMap.get(c.getName());
        }
        try {
            hero = (Hero) Class.forName(c.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            Log.d(S.TAG, "createHero: 类定义错误 ");
        } catch (InstantiationException e) {
            e.printStackTrace();
            Log.d(S.TAG, "createHero: 实例化异常 ");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            Log.d(S.TAG, "createHero: 类找不到 ");
        }
        heroMap.put(hero.getClass().getSimpleName(), hero);
        return hero;
    }

    public static Hero createHero() {
        if (classList == null) {
            classList = new ArrayList<>();
            classList.add(HuoQiang.class);
            classList.add(LaiEn.class);
            classList.add(LanMao.class);
            classList.add(WuYao.class);
        }

        Hero hero = null;
        Random random = new Random();
        int index = random.nextInt(classList.size());


        try {
            hero = (Hero) Class.forName(classList.get(index).getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            Log.d(S.TAG, "createHero: 类定义错误 ");
        } catch (InstantiationException e) {
            e.printStackTrace();
            Log.d(S.TAG, "createHero: 实例化异常 ");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            Log.d(S.TAG, "createHero: 类找不到 ");
        }
        return hero;
    }
}
