package com.jicl.design.iterator.example;

import java.util.ArrayList;
import java.util.List;

/**
 * B公司
 *
 * @author : xianzilei
 * @date : 2020/11/10 11:10
 */
public class CompanyB implements AggregateGroup {

    /**
     * 公司员工集合
     */
    private Employee[] employees = new Employee[5];

    //模拟数据库数据
    {
        employees[0] = new Employee("B001", "王小二");
        employees[1] = new Employee("B002", "张伟");
        employees[2] = new Employee("B003", "李大嘴");
        employees[3] = new Employee("B004", "上官皓");
        employees[4] = new Employee("B005", "欧阳峰");
    }

    @Override
    public Iterator createIterator() {
        //返回数组迭代器
        return new ArrayIterator(employees);
    }
}
