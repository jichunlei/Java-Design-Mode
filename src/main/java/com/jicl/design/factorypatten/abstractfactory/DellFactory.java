package com.jicl.design.factorypatten.abstractfactory;

/**
 * 戴尔工厂
 *
 * @author : xianzilei
 * @date : 2020/9/22 18:10
 */
public class DellFactory implements AbstractFactory {
    @Override
    public MainBoard createMainboard() {
        return new DellMainBoard();
    }

    @Override
    public Screen createScreen() {
        return new DellScreen();
    }

    @Override
    public Battery createBattery() {
        return new DellBattery();
    }
}
