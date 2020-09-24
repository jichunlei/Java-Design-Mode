package com.jicl.design.prototype;

/**
 * 抽象订单
 *
 * @author : xianzilei
 * @date : 2020/9/24 15:40
 */
public abstract class AbstractOrder {

    private Integer goodsNum;

    //获取订单商品数
    public Integer getGoodsNum() {
        return goodsNum;
    }

    //设置订单商品数
    protected void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    //复制
    public abstract AbstractOrder selfCopy();
}
