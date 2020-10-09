package com.jicl.design.decorator;

import java.math.BigDecimal;

/**
 * 咖啡（抽象构件）
 *
 * @author : xianzilei
 * @date : 2020/6/4 11:15
 */
public abstract class AbstractCafe {
    /**
     * 咖啡详情
     */
    protected String description = "未知类型的咖啡";

    /**
     * 咖啡详情
     *
     * @return java.lang.String
     * @author xianzilei
     * @date 2020/10/9 18:57
     **/
    public String getDescription() {
        return description;
    }

    /**
     * 咖啡消费金额
     *
     * @return java.math.BigDecimal
     * @author xianzilei
     * @date 2020/10/9 18:57
     **/
    public abstract BigDecimal cost();
}
