package com.jicl.design.visitor;

/**
 * 抽象访问者
 *
 * @author : xianzilei
 * @date : 2020/11/10 14:52
 */
public interface Visitor {

    /**
     * 访问正式员工
     *
     * @param fullTimeEmployee 正式员工
     * @return void
     * @author xianzilei
     * @date 2020/11/10 14:57
     **/
    void visit(FullTimeEmployee fullTimeEmployee);

    /**
     * 访问临时工
     *
     * @param partTimeEmployee 1
     * @return void
     * @author xianzilei
     * @date 2020/11/10 14:58
     **/
    void visit(PartTimeEmployee partTimeEmployee);
}
