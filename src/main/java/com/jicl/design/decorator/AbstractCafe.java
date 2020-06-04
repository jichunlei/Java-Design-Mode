package com.jicl.design.decorator;

import java.math.BigDecimal;

/**
 * 咖啡（抽象构件）
 *
 * @author : xianzilei
 * @date : 2020/6/4 11:15
 */
public abstract class AbstractCafe {
    protected String description = "未知类型的咖啡";

    public String getDescription() {
        return description;
    }

    public abstract BigDecimal cost();
}
