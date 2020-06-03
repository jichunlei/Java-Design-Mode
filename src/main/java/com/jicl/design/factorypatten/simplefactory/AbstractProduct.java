package com.jicl.design.factorypatten.simplefactory;

/**
 * 抽象产品接口
 *
 * @author : xianzilei
 * @date : 2020/6/3 08:54
 */
public abstract class AbstractProduct {
    private String name;

    private Double price;

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final Double getPrice() {
        return price;
    }

    public final void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 功能描述: 产品展示
     *
     * @return void
     * @author xianzilei
     * @date 2020/6/3 9:02
     **/
    protected abstract void show();
}
