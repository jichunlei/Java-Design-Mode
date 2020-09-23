package com.jicl.design.factorypatten.abstractfactory;

/**
 * 戴尔电池
 *
 * @author : xianzilei
 * @date : 2020/9/22 18:03
 */
public class DellBattery implements Battery{
    @Override
    public void show() {
        System.out.println("戴尔电池");
    }
}
