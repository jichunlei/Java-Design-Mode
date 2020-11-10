package com.jicl.design.iterator.example;

/**
 * 数组迭代器
 *
 * @author : xianzilei
 * @date : 2020/11/10 11:14
 */
public class ArrayIterator implements Iterator {

    /**
     * 数组集合
     */
    private Employee[] employees;

    /**
     * 索引位置
     */
    private int index = -1;

    public ArrayIterator(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        return index < employees.length - 1;
    }

    @Override
    public Employee next() {
        return employees[++index];
    }
}
