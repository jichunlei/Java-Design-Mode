package com.jicl.design.visitor;

/**
 * 抽象员工
 *
 * @author : xianzilei
 * @date : 2020/11/10 14:49
 */
public interface Employee {

    /**
     * 接受一个抽象访问者访问
     *
     * @param visitor 访问者
     * @return void
     * @author xianzilei
     * @date 2020/11/10 14:56
     **/
    void accept(Visitor visitor);
}
