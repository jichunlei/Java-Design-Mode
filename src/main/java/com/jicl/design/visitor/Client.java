package com.jicl.design.visitor;

/**
 * TODO
 *
 * @author : xianzilei
 * @date : 2020/11/10 18:09
 */
public class Client {

    public static void main(String[] args) {
        //创建员工基础信息
        ObjectStructure structure = new ObjectStructure();
        structure.addEmployee(new FullTimeEmployee("张三", 5000d, 22.5f));
        structure.addEmployee(new PartTimeEmployee("李四", 3500d, 23.5f));
        structure.addEmployee(new FullTimeEmployee("王五", 3200d, 22f));
        structure.addEmployee(new PartTimeEmployee("赵六", 3200d, 22f));
        structure.addEmployee(new PartTimeEmployee("王气", 6200d, 22f));
        structure.addEmployee(new FullTimeEmployee("刘八", 7400d, 22f));

        System.out.println("财务部访问员工数据...");
        structure.handle(new FinanceVisitor());
        System.out.println("-------------------------------------");
        System.out.println("人事部访问员工数据...");
        structure.handle(new PersonalVisitor());
    }
}
