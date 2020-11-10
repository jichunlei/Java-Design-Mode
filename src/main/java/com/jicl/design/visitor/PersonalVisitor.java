package com.jicl.design.visitor;

/**
 * 人事部门（具体访问者）
 *
 * @author : xianzilei
 * @date : 2020/11/10 17:59
 */
public class PersonalVisitor implements Visitor {

    @Override
    public void visit(FullTimeEmployee fullTimeEmployee) {
        System.out.println("正式员工姓名：" + fullTimeEmployee.getName() + "，正式员工出勤天数："
                + fullTimeEmployee.getAttendanceDays());
    }

    @Override
    public void visit(PartTimeEmployee partTimeEmployee) {
        System.out.println("临时员工姓名：" + partTimeEmployee.getName() + "，临时员工出勤天数："
                + partTimeEmployee.getAttendanceDays());
    }
}
