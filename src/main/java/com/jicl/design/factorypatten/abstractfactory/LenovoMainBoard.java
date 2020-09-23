package com.jicl.design.factorypatten.abstractfactory;

/**
 * 联想主板
 *
 * @author : xianzilei
 * @date : 2020/9/22 17:59
 */
public class LenovoMainBoard implements MainBoard{
    @Override
    public void show() {
        System.out.println("联想主板...");
    }
}
