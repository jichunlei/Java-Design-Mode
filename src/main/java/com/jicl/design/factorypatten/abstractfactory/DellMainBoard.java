package com.jicl.design.factorypatten.abstractfactory;

/**
 * 戴尔主板
 *
 * @author : xianzilei
 * @date : 2020/9/22 18:01
 */
public class DellMainBoard implements MainBoard{
    @Override
    public void show() {
        System.out.println("戴尔主板...");
    }
}
