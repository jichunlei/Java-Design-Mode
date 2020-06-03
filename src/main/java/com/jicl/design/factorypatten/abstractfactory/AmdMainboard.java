package com.jicl.design.factorypatten.abstractfactory;

/**
 * TODO
 *
 * @author : xianzilei
 * @date : 2020/6/3 13:26
 */
public class AmdMainboard implements Mainboard {
    /**
     * CPU插槽的孔数
     */
    private int cpuHoles = 0;

    /**
     * 构造方法，传入CPU插槽的孔数
     *
     * @param cpuHoles
     */
    public AmdMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    public void installCPU() {
        System.out.println("AMD主板的CPU插槽孔数是：" + cpuHoles);
    }
}
