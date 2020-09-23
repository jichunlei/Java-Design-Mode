package com.jicl.design.factorypatten.abstractfactory;

/**
 * 抽象工厂类
 *
 * @author : xianzilei
 * @date : 2020/6/3 13:13
 */
public interface AbstractFactory {
    /**
     * 生产主板
     *
     * @return com.jicl.design.factorypatten.abstractfactory.Mainboard
     * @author xianzilei
     * @date 2020/9/21 20:37
     **/
    MainBoard createMainboard();

    /**
     * 生产屏幕
     *
     * @return com.jicl.design.factorypatten.abstractfactory.Screen
     * @author xianzilei
     * @date 2020/9/21 20:38
     **/
    Screen createScreen();

    /**
     * 生产电池
     *
     * @return com.jicl.design.factorypatten.abstractfactory.Battery
     * @author xianzilei
     * @date 2020/9/21 20:38
     **/
    Battery createBattery();
}
