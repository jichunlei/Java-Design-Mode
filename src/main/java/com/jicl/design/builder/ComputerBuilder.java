package com.jicl.design.builder;

/**
 * 电脑构造类
 *
 * @author : xianzilei
 * @date : 2020/6/3 14:12
 */
public class ComputerBuilder {

    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;

    public ComputerBuilder cpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder screen(String screen) {
        this.screen = screen;
        return this;
    }

    public ComputerBuilder memory(String memory) {
        this.memory = memory;
        return this;
    }

    public ComputerBuilder mainboard(String mainboard) {
        this.mainboard = mainboard;
        return this;
    }

    public Computer build() {
        return new Computer(cpu, screen, memory, mainboard);
    }
}
