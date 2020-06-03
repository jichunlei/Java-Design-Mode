package com.jicl.design.factorypatten.simplefactory;

import org.junit.Test;

/**
 * 简单工厂模式测试
 *
 * @author : xianzilei
 * @date : 2020/6/3 09:13
 */
public class SimpleProductFactoryTest {
    @Test
    public void test() {
        AbstractProduct a = SimpleProductFactory.getProduct("A");
        AbstractProduct b = SimpleProductFactory.getProduct("B");
        AbstractProduct c = SimpleProductFactory.getProduct("C");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
