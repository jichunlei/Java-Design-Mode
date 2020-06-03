package com.jicl.design.factorypatten.abstractfactory;

/**
 * Intel的Cpu
 *
 * @author : xianzilei
 * @date : 2020/6/3 13:23
 */
public class IntelCpu implements Cpu {
    /**
     * CPU的针脚数
     */
    private int pins = 0;

    public IntelCpu(int pins) {
        this.pins = pins;
    }

    public void calculate() {
        System.out.println("Intel CPU的针脚数：" + pins);
    }
}
