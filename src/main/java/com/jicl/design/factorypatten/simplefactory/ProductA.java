package com.jicl.design.factorypatten.simplefactory;

/**
 * 产品A
 *
 * @author : xianzilei
 * @date : 2020/6/3 08:58
 */
public class ProductA extends AbstractProduct {

    @Override
    protected void show() {
        System.out.println("我是产品A");
    }
}
