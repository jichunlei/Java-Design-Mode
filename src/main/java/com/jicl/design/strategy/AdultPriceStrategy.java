package com.jicl.design.strategy;

/**
 * 成人票价算法
 *
 * @author : xianzilei
 * @date : 2020/10/27 18:53
 */
public class AdultPriceStrategy implements PriceStrategy {
    @Override
    public double calcPrice(double originalPrice) {
        return originalPrice * 0.9;
    }
}
