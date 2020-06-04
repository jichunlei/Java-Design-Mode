package com.jicl.design.decorator;

import java.math.BigDecimal;

/**
 * 摩卡调料（具体装饰构件）
 *
 * @author : xianzilei
 * @date : 2020/6/4 11:33
 */
public class MochaCondiment extends CondimentDecorator {

    //被装饰着
    private AbstractCafe cafe;

    public MochaCondiment(AbstractCafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public String getDescription() {
        return cafe.getDescription() + ",加上调料摩卡";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal("0.2").add(cafe.cost());
    }
}
