package com.jicl.design.bridge;

/**
 * 毛笔
 *
 * @author : xianzilei
 * @date : 2020/6/4 14:45
 */
public class BrushPen extends Pen {

    public BrushPen(Color color) {
        super.color = color;
        super.desc = "毛笔";
    }

    @Override
    public void draw() {
        System.out.println("用" + color.getDescription() + desc + "画画...");
    }
}
