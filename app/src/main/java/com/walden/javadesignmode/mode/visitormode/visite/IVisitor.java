package com.walden.javadesignmode.mode.visitormode.visite;

import com.walden.javadesignmode.mode.visitormode.member.CommonEmployee;
import com.walden.javadesignmode.mode.visitormode.member.Manager;

/**
 * Created by walden on 2017/7/14.
 * 抽象访问者
 */

public interface IVisitor {
    String visit(CommonEmployee commonEmployee);

    String visit(Manager manager);
}
