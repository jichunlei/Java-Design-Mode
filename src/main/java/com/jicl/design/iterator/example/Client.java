package com.jicl.design.iterator.example;

/**
 * TODO
 *
 * @author : xianzilei
 * @date : 2020/11/10 11:29
 */
public class Client {

    public static void main(String[] args) {
        //公司A和公司B
        AggregateGroup companyA = new CompanyA();
        AggregateGroup companyB = new CompanyB();

        //定义团体管理类
        AggregateGroupManager aggregateGroupManager = new AggregateGroupManager();
        aggregateGroupManager.addGroup(companyA);
        aggregateGroupManager.addGroup(companyB);

        //遍历员工信息
        aggregateGroupManager.traverseEmployees();
    }
}
