package com.jicl.design.decorator;

import java.math.BigDecimal;

/**
 * 浓咖啡（具体构件）
 *
 * @author : xianzilei
 * @date : 2020/6/4 11:28
 */
public class ThickCafe extends AbstractCafe {

    public ThickCafe() {
        description = "浓咖啡";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal("8.88");
    }
}

