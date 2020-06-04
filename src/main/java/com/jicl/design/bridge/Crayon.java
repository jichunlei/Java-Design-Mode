package com.jicl.design.bridge;

/**
 * 蜡笔
 *
 * @author : xianzilei
 * @date : 2020/6/4 14:33
 */
public class Crayon extends Pen {

    public Crayon(Color color) {
        super.color = color;
        super.desc = "蜡笔";
    }

    @Override
    public void draw() {
        System.out.println("用" + color.getDescription() + desc + "画画...");
    }
}
