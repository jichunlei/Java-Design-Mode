package com.jicl.design.factorypatten.abstractfactory;

/**
 * 联想工厂
 *
 * @author : xianzilei
 * @date : 2020/9/22 18:07
 */
public class LenovoFactory implements AbstractFactory{
    @Override
    public MainBoard createMainboard() {
        return new LenovoMainBoard();
    }

    @Override
    public Screen createScreen() {
        return new LenovoScreen();
    }

    @Override
    public Battery createBattery() {
        return new LenovoBattery();
    }
}
