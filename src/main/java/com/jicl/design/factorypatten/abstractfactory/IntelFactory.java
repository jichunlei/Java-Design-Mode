package com.jicl.design.factorypatten.abstractfactory;

/**
 * Intel工厂类
 *
 * @author : xianzilei
 * @date : 2020/6/3 13:27
 */
public class IntelFactory implements AbstractFactory {

    public Cpu createCpu() {
        return new IntelCpu(998);
    }

    public Mainboard createMainboard() {
        return new IntelMainboard(998);
    }
}
