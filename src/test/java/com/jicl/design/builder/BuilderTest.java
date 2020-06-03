package com.jicl.design.builder;

import org.junit.Test;

/**
 * 建造者模式测试
 *
 * @author : xianzilei
 * @date : 2020/6/3 14:20
 */
public class BuilderTest {

    @Test
    public void test() {
        ComputerBuilder builder = new ComputerBuilder();
        Computer computer = builder.cpu("AMD").screen("三星").memory("1T").mainboard("ASUS").build();
        System.out.println(computer);
    }
}
