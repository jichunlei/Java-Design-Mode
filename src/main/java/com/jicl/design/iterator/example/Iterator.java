package com.jicl.design.iterator.example;

/**
 * 抽象迭代器
 *
 * @author : xianzilei
 * @date : 2020/11/10 9:35
 */
public interface Iterator {

    /**
     * 是否存在下一索引值
     *
     * @return boolean
     * @author xianzilei
     * @date 2020/11/10 9:36
     **/
    boolean hasNext();

    /**
     * 游标移动，并返回遍历到的元素
     *
     * @return com.jicl.design.iterator.example.Employee
     * @author xianzilei
     * @date 2020/11/10 9:37
     **/
    Employee next();
}
