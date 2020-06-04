package com.jicl.design.bridge;

/**
 * 笔（抽象接口）
 *
 * @author : xianzilei
 * @date : 2020/6/4 14:19
 */
public abstract class Pen {

    protected Color color;
    protected String desc;

    public abstract void draw();
}
