package com.jicl.design.factorypatten.abstractfactory;

/**
 * AMD的CPU
 *
 * @author : xianzilei
 * @date : 2020/6/3 13:24
 */
public class AmdCpu implements Cpu {

    /**
     * CPU的针脚数
     */
    private int pins = 0;

    public AmdCpu(int pins) {
        this.pins = pins;
    }


    public void calculate() {
        System.out.println("AMD CPU的针脚数：" + pins);
    }
}
