package com.jicl.design.adapter;

/**
 * 目标接口实现（双向适配）
 *
 * @author : xianzilei
 * @date : 2020/6/4 10:15
 */
public class TwoWayTargetRealize implements  TwoWayTarget{

    public void request() {
        System.out.println("目标代码被调用！");
    }
}
