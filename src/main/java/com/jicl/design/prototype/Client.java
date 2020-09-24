package com.jicl.design.prototype;

import java.util.List;

/**
 * TODO
 *
 * @author : xianzilei
 * @date : 2020/9/24 15:46
 */
public class Client {
    public static void main(String[] args) {
        //创建企业订单
        CompanyOrder companyOrder = new CompanyOrder();
        companyOrder.setCompanyCode("W001");
        companyOrder.setCompanyName("贤子磊的煎饼小店");
        companyOrder.setGoodsNum(1502);

        List<AbstractOrder> companyOrderList = OrderManager.splitOrder(companyOrder);
        for (AbstractOrder order : companyOrderList) {
            System.out.println(order);
        }
    }
}
