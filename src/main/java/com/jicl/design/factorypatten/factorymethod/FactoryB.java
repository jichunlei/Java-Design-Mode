package com.jicl.design.factorypatten.factorymethod;

/**
 * 工厂A
 *
 * @author : xianzilei
 * @date : 2020/6/3 12:59
 */
public class FactoryB extends AbstractProductFactory {


    @Override
    public Product produce() {
        return new ProductB();
    }
}
