package com.jicl.design.iterator.example;

import java.util.List;

/**
 * list迭代器
 *
 * @author : xianzilei
 * @date : 2020/11/10 11:12
 */
public class ListIterator implements Iterator {

    /**
     * list集合
     */
    private List<Employee> employeeList;

    /**
     * 索引位置
     */
    private int index = -1;

    public ListIterator(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public boolean hasNext() {
        return index < employeeList.size() - 1;
    }

    @Override
    public Employee next() {
        return employeeList.get(++index);
    }
}
