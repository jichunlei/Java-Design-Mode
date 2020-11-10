package com.jicl.design.iterator.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 聚合团体管理类
 *
 * @author : xianzilei
 * @date : 2020/11/10 11:30
 */
public class AggregateGroupManager {

    /**
     * 聚合团体集合
     */
    private List<AggregateGroup> groups = new ArrayList<>();

    /**
     * 添加团体
     *
     * @param aggregateGroup 1
     * @return void
     * @author xianzilei
     * @date 2020/11/10 11:34
     **/
    public void addGroup(AggregateGroup aggregateGroup) {
        groups.add(aggregateGroup);
    }

    /**
     * 遍历员工信息（可以统一使用迭代器来进行遍历）
     *
     * @return void
     * @author xianzilei
     * @date 2020/11/10 11:34
     **/
    public void traverseEmployees() {
        for (AggregateGroup group : groups) {
            //获取集合的迭代器
            Iterator iterator = group.createIterator();
            //遍历集合中的元素
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }
}
