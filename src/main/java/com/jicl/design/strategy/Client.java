package com.jicl.design.strategy;

/**
 * TODO
 *
 * @author : xianzilei
 * @date : 2020/10/27 18:42
 */
public class Client {
    public static void main(String[] args) {
        double originalPrice = 30.00;
        double adultPrice = PriceStrategyContext.getPriceStrategy("adult").calcPrice(originalPrice);
        System.out.println("成人票价" + adultPrice);
        double studentPrice = PriceStrategyContext.getPriceStrategy("student").calcPrice(originalPrice);
        System.out.println("学生票价" + studentPrice);
        double childrenPrice = PriceStrategyContext.getPriceStrategy("children").calcPrice(originalPrice);
        System.out.println("儿童票价" + childrenPrice);
    }
}
