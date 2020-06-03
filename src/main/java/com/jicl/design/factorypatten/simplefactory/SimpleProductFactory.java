package com.jicl.design.factorypatten.simplefactory;

/**
 * 产品工厂
 *
 * @author : xianzilei
 * @date : 2020/6/3 09:07
 */
public class SimpleProductFactory {

    /**
     * 功能描述: 生产产品
     *
     * @param productName 1
     * @return com.jicl.design.factorypatten.simplefactory.AbstractProduct
     * @author xianzilei
     * @date 2020/6/3 9:11
     **/
    public static AbstractProduct getProduct(String productName) {
        if ("A".equals(productName)) {
            return new ProductA();
        } else if ("B".equals(productName)) {
            return new ProductB();
        }
        return null;
    }
}
