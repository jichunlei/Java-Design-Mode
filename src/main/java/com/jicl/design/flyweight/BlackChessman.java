package com.jicl.design.flyweight;

/**
 * 黑棋
 *
 * @author : xianzilei
 * @date : 2020/10/23 19:17
 */
public class BlackChessman extends Chessman {
    public BlackChessman() {
        setColor("黑");
    }

    @Override
    public void display(int x, int y) {
        System.out.println(getColor() + "棋-坐标：" + x + "," + y);
    }
}
