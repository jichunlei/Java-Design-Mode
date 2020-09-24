package com.jicl.design.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 订单管理
 *
 * @author : xianzilei
 * @date : 2020/9/24 15:47
 */
public class OrderManager {

    /**
     * 最大拆分间隔数
     */
    private static final Integer SPLIT_INTERVAL_NUM = 500;

    /**
     * 拆分订单
     *
     * @param sourceOrder 1
     * @return java.util.List<com.jicl.design.prototype.AbstractOrder>
     * @author xianzilei
     * @date 2020/9/24 16:52
     **/
    public static List<AbstractOrder> splitOrder(AbstractOrder sourceOrder) {
        List<AbstractOrder> result = new ArrayList<>();
        //无需判断订单类型，直接拆分
        while (sourceOrder.getGoodsNum() > SPLIT_INTERVAL_NUM) {
            //自我复制出新订单
            AbstractOrder copy = sourceOrder.selfCopy();
            //更新订单数
            copy.setGoodsNum(SPLIT_INTERVAL_NUM);
            result.add(copy);
            sourceOrder.setGoodsNum(sourceOrder.getGoodsNum() - SPLIT_INTERVAL_NUM);
        }
        result.add(sourceOrder);
        return result;
    }
}
