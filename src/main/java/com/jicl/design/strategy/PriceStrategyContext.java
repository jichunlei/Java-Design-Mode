package com.jicl.design.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 票价算法容器
 *
 * @author : xianzilei
 * @date : 2020/10/27 18:59
 */
public class PriceStrategyContext {
    /**
     * 票价算法容器
     */
    private static Map<String, PriceStrategy> priceStrategyMap = new HashMap<>();

    //初始化容器
    static {
        priceStrategyMap.put("adult", new AdultPriceStrategy());
        priceStrategyMap.put("student", new StudentPriceStrategy());
        priceStrategyMap.put("children", new ChildrenPriceStrategy());
    }

    /**
     * 获取票价算法器
     *
     * @param type 用户类型
     * @return com.jicl.design.strategy.PriceStrategy
     * @author xianzilei
     * @date 2020/10/27 19:06
     **/
    public static PriceStrategy getPriceStrategy(String type) {
        if (priceStrategyMap.containsKey(type)) {
            return priceStrategyMap.get(type);
        }
        throw new RuntimeException("不支持的计算类型");
    }
}
