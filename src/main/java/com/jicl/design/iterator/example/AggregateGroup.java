package com.jicl.design.iterator.example;

/**
 * 抽象的聚合团体
 *
 * @author : xianzilei
 * @date : 2020/11/10 9:34
 */
public interface AggregateGroup {

    /**
     * 创建迭代器
     *
     * @return com.jicl.design.iterator.example.Iterator
     * @author xianzilei
     * @date 2020/11/10 11:10
     **/
    Iterator createIterator();
}
