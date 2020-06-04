package com.jicl.design.adapter;

/**
 * 被适配者接口实现（双向适配）
 *
 * @author : xianzilei
 * @date : 2020/6/4 10:16
 */
public class TwoWayAdapteeRealize implements  TwoWayAdaptee{

    public void specificRequest() {
        System.out.println("被适配者代码被调用！");
    }
}
