package com.jicl.design.factorypatten.factorymethod;

/**
 * 抽象工厂类
 *
 * @author : xianzilei
 * @date : 2020/6/3 12:57
 */
public abstract class AbstractProductFactory {
    /**
     * 功能描述: 生成产品
     *
     * @return com.jicl.design.factorypatten.factorymethod.Product
     * @author xianzilei
     * @date 2020/6/3 13:04
     **/
    public abstract Product produce();
}
