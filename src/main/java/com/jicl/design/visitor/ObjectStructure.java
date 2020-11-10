package com.jicl.design.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构角色
 *
 * @author : xianzilei
 * @date : 2020/11/10 18:13
 */
public class ObjectStructure {

    private List<Employee> employees = new ArrayList<>();

    /**
     * 添加员工到集合中
     *
     * @param employee 1
     * @return void
     * @author xianzilei
     * @date 2020/11/10 18:16
     **/
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    /**
     * 访问用户数据（具体的访问细节由传递来的访问者决定）
     *
     * @param visitor 1
     * @return void
     * @author xianzilei
     * @date 2020/11/10 18:16
     **/
    public void handle(Visitor visitor) {
        for (Employee employee : employees) {
            //每个员工接受访问者访问
            employee.accept(visitor);
        }
    }
}
