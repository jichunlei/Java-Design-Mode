package com.jicl.design.strategy;

/**
 * 学生票价算法
 *
 * @author : xianzilei
 * @date : 2020/10/27 18:55
 */
public class StudentPriceStrategy implements PriceStrategy {
    @Override
    public double calcPrice(double originalPrice) {
        return originalPrice * 0.5;
    }
}
