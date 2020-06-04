package com.jicl.design.adapter;

/**
 * 双向适配器
 *
 * @author : xianzilei
 * @date : 2020/6/4 10:17
 */
public class TwoWayAdapter implements TwoWayTarget, TwoWayAdaptee {

    private TwoWayTarget target;
    private TwoWayAdaptee adaptee;

    public TwoWayAdapter(TwoWayTarget target) {
        this.target = target;
    }

    public TwoWayAdapter(TwoWayAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void specificRequest() {
        adaptee.specificRequest();
    }

    public void request() {
        target.request();
    }
}
