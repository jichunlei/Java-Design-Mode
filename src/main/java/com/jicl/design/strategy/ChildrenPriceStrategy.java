package com.jicl.design.strategy;

/**
 * 儿童票价算法
 *
 * @author : xianzilei
 * @date : 2020/10/27 18:56
 */
public class ChildrenPriceStrategy implements PriceStrategy {
    @Override
    public double calcPrice(double originalPrice) {
        return originalPrice >= 10 ? originalPrice - 10 : originalPrice * 0.8;
    }
}
