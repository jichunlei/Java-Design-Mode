package com.jicl.design.flyweight;

/**
 * 具体的享元角色
 *
 * @author : xianzilei
 * @date : 2020/9/9 16:32
 */
public class ConcreteWebsiteFlyweight extends WebsiteFlyweight {

    private String type;

    public ConcreteWebsiteFlyweight(String type) {
        this.type = type;
    }

    @Override
    public void show() {
        System.out.println(type + "类型网站展示...");
    }
}
