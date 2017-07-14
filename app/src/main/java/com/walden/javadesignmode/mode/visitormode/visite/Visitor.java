package com.walden.javadesignmode.mode.visitormode.visite;

import com.walden.javadesignmode.mode.visitormode.member.CommonEmployee;
import com.walden.javadesignmode.mode.visitormode.member.Employee;
import com.walden.javadesignmode.mode.visitormode.member.Manager;

/**
 * Created by walden on 2017/7/14.
 * 具体访问者
 */

public class Visitor implements IVisitor {
    @Override
    public String visit(CommonEmployee commonEmployee) {
        return getCommonEmployee(commonEmployee);
    }

    @Override
    public String visit(Manager manager) {
        return getManagerInfo(manager);
    }

    private String getBaseInfo(Employee employee) {
        StringBuilder builder = new StringBuilder();
        builder.append("姓名: " + employee.getName());
        builder.append("  性别: " + (employee.getSex() == Employee.MALE ? "男" : "女"));
        builder.append("  薪水:" + employee.getSalsry()+"\n");
        return builder.toString();
    }

    private String getManagerInfo(Manager manager) {
        return getBaseInfo(manager) + "业绩 :" + manager.getPerformance()+"\n\n";
    }

    private String getCommonEmployee(CommonEmployee commonEmployee) {
        return getBaseInfo(commonEmployee) + "工作 :" + commonEmployee.getJob()+"\n\n";
    }
}
