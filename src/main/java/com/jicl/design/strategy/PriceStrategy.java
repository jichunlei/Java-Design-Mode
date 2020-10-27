package com.jicl.design.strategy;

/**
 * 折扣策略
 *
 * @author : xianzilei
 * @date : 2020/10/27 18:29
 */
public interface PriceStrategy {

    /**
     * 计算折扣价
     *
     * @param originalPrice 1
     * @return double
     * @author xianzilei
     * @date 2020/10/27 18:31
     **/
    double calcPrice(double originalPrice);
}
