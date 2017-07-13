package com.walden.javadesignmode.mode.compositemode;

import java.util.ArrayList;

/**
 * Created by walden on 2017/7/13.
 */

public interface IBranch {

    public void addSubordinate(ICorp crop);   //添加一个子节点

    public ArrayList<ICorp> getSubordinate();   //获取全部子节点

}
