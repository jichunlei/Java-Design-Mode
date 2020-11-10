package com.jicl.design.iterator.example;

import java.util.ArrayList;
import java.util.List;

/**
 * A公司
 *
 * @author : xianzilei
 * @date : 2020/11/10 11:10
 */
public class CompanyA implements AggregateGroup {

    /**
     * 公司员工集合
     */
    private List<Employee> employees = new ArrayList<>();

    //模拟数据库数据
    {
        employees.add(new Employee("A001", "张三"));
        employees.add(new Employee("A002", "李四"));
        employees.add(new Employee("A003", "王五"));
    }

    @Override
    public Iterator createIterator() {
        //返回list迭代器
        return new ListIterator(employees);
    }
}
