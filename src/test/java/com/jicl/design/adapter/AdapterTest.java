package com.jicl.design.adapter;

import org.junit.Test;

/**
 * 适配器模式测试
 *
 * @author : xianzilei
 * @date : 2020/6/4 09:56
 */
public class AdapterTest {

    @Test
    public void testClassAdapter() {
        Target target = new ClassAdapter();
        target.request();
    }

    @Test
    public void testObjectAdapter() {
        Target target = new ObjectAdapter(new Adaptee());
        target.request();
    }

    @Test
    public void testTwoWayAdapter() {
        TwoWayTarget target = new TwoWayAdapter(new TwoWayTargetRealize());
        target.request();
        TwoWayAdaptee adaptee = new TwoWayAdapter(new TwoWayAdapteeRealize());
        adaptee.specificRequest();
    }
}
