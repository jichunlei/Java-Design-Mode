package com.jicl.design.factorypatten.abstractfactory;

/**
 * 抽象工厂类
 *
 * @author : xianzilei
 * @date : 2020/6/3 13:13
 */
public interface AbstractFactory {
    /**
     * 创建CPU对象
     *
     * @return CPU对象
     */
    public Cpu createCpu();

    /**
     * 创建主板对象
     *
     * @return 主板对象
     */
    public Mainboard createMainboard();
}
