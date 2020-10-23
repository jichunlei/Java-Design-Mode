package com.jicl.design.flyweight;

/**
 * TODO
 *
 * @author : xianzilei
 * @date : 2020/10/23 19:22
 */
public class Client {

    public static void main(String[] args) {
        //创建白棋1
        Chessman whiteChessman1 = ChessmanFactory.createChessman("w");
        //创建白棋2
        Chessman whiteChessman2 = ChessmanFactory.createChessman("w");
        //两个白棋是同一个对象
        System.out.println(whiteChessman1 == whiteChessman2);
        whiteChessman1.display(1, 3);
        whiteChessman2.display(2, 4);

        //创建黑棋1
        Chessman blackChessman1 = ChessmanFactory.createChessman("b");
        //创建黑棋2
        Chessman blackChessman2 = ChessmanFactory.createChessman("b");
        //两个黑棋是同一个对象
        System.out.println(blackChessman1 == blackChessman2);
        blackChessman1.display(2, 1);
        blackChessman2.display(3, 2);
    }
}
