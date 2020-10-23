package com.jicl.design.flyweight;

/**
 * 白棋
 *
 * @author : xianzilei
 * @date : 2020/10/23 19:14
 */
public class WhiteChessman extends Chessman {
    public WhiteChessman() {
        setColor("白");
    }

    @Override
    public void display(int x, int y) {
        System.out.println(getColor() + "棋-坐标：" + x + "," + y);
    }
}
