package com.jicl.design.decorator;

import java.math.BigDecimal;

/**
 * 豆浆调料（具体装饰构件）
 *
 * @author : xianzilei
 * @date : 2020/6/4 11:36
 */
public class SoyCondiment extends CondimentDecorator {
    //被装饰着
    private AbstractCafe cafe;

    public SoyCondiment(AbstractCafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public String getDescription() {
        return cafe.getDescription() + ",加上调料豆浆";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal("0.3").add(cafe.cost());
    }
}
