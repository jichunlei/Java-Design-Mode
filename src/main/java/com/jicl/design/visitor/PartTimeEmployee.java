package com.jicl.design.visitor;

/**
 * 正式员工
 *
 * @author : xianzilei
 * @date : 2020/11/10 14:49
 */
public class PartTimeEmployee implements Employee {

    /**
     * 员工姓名
     */
    private String name;
    /**
     * 员工薪水
     */
    private Double salary;
    /**
     * 员工出勤天数
     */
    private Float attendanceDays;

    public PartTimeEmployee(String name, Double salary, Float attendanceDays) {
        this.name = name;
        this.salary = salary;
        this.attendanceDays = attendanceDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Float getAttendanceDays() {
        return attendanceDays;
    }

    public void setAttendanceDays(Float attendanceDays) {
        this.attendanceDays = attendanceDays;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
