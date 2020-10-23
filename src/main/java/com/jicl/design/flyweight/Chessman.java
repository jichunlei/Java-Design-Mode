package com.jicl.design.flyweight;

/**
 * 抽象棋子类
 *
 * @author : xianzilei
 * @date : 2020/10/23 19:12
 */
public abstract class Chessman {
    /**
     * 颜色
     */
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 摆放棋子
     *
     * @param x 1
     * @param y 2
     * @return void
     * @author xianzilei
     * @date 2020/10/23 19:25
     **/
    public abstract void display(int x, int y);
}
