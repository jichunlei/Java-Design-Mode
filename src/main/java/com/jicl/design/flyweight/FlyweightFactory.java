package com.jicl.design.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 网站创建工厂
 *
 * @author : xianzilei
 * @date : 2020/9/9 16:29
 */
public class FlyweightFactory {

    private static Map<String, WebsiteFlyweight> websiteFlyweightPool = new HashMap<>();

    public static WebsiteFlyweight createWebsiteFlyweight(String type) {
        if (!websiteFlyweightPool.containsKey(type)) {
            websiteFlyweightPool.put(type, new ConcreteWebsiteFlyweight(type));
        }
        return websiteFlyweightPool.get(type);
    }
}
