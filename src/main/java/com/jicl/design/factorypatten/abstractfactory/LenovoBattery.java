package com.jicl.design.factorypatten.abstractfactory;

/**
 * 联想电池
 *
 * @author : xianzilei
 * @date : 2020/9/22 18:04
 */
public class LenovoBattery implements Battery{
    @Override
    public void show() {
        System.out.println("联想电池");
    }
}
