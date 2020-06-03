package com.jicl.design.factorypatten.abstractfactory;

/**
 * TODO
 *
 * @author : xianzilei
 * @date : 2020/6/3 13:28
 */
public class AmdFactory implements AbstractFactory {

    public Cpu createCpu() {
        return new AmdCpu(999);
    }

    public Mainboard createMainboard() {
        return new AmdMainboard(999);
    }
}
