package com.jicl.design.iterator.example;

/**
 * 员工信息
 *
 * @author : xianzilei
 * @date : 2020/11/10 9:29
 */
public class Employee {

    /**
     * 员工编号
     */
    private String id;

    /**
     * 员工姓名
     */
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("员工编号：");
        sb.append(id);
        sb.append(", 员工姓名：").append(name);
        return sb.toString();
    }
}
