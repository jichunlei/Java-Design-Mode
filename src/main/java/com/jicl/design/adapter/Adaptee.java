package com.jicl.design.adapter;

/**
 * 被适配者
 *
 * Target期待调用Request方法，而Adaptee并没有（这就是所谓的不兼容了)
 *
 * @author : xianzilei
 * @date : 2020/6/4 09:54
 */
public class Adaptee {
    public void specificRequest() {
        System.out.println("被适配者中的业务代码被调用！");
    }
}
