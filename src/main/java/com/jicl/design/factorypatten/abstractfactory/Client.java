package com.jicl.design.factorypatten.abstractfactory;

/**
 * TODO
 *
 * @author : xianzilei
 * @date : 2020/9/22 18:22
 */
public class Client {
    public static void main(String[] args) {
        //创建Dell工厂
        AbstractFactory factory = new DellFactory();
        MainBoard mainboard = factory.createMainboard();
        Screen screen = factory.createScreen();
        Battery battery = factory.createBattery();
        mainboard.show();
        screen.show();
        battery.show();
    }
}
