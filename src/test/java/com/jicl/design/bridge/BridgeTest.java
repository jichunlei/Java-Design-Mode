package com.jicl.design.bridge;

import org.junit.Test;

/**
 * 桥接模式测试
 *
 * @author : xianzilei
 * @date : 2020/6/4 14:48
 */
public class BridgeTest {

    @Test
    public void test() {
        Pen pen1 = new BrushPen(new Yellow());
        pen1.draw();

        Pen pen2 = new Crayon(new Blue());
        pen2.draw();
    }

}
