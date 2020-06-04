package com.jicl.design.decorator;

import java.math.BigDecimal;

/**
 * 黑咖啡（具体构件）
 *
 * @author : xianzilei
 * @date : 2020/6/4 11:24
 */
public class BlackCafe extends AbstractCafe {

    public BlackCafe() {
        description = "黑咖啡";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal("9.99");
    }
}
