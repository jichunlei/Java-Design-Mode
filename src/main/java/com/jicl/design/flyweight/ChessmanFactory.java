package com.jicl.design.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 棋子管理工厂
 *
 * @author : xianzilei
 * @date : 2020/10/23 19:18
 */
public class ChessmanFactory {
    /**
     * 棋池
     */
    private static Map<String, Chessman> chessmanPool = new HashMap<>();

    //初始化棋池为黑白两个棋子
    static {
        chessmanPool.put("b", new BlackChessman());
        chessmanPool.put("w", new WhiteChessman());
    }

    /**
     * 创建棋子
     *
     * @param type 1
     * @return com.jicl.design.flyweight.Chessman
     * @author xianzilei
     * @date 2020/10/23 19:28
     **/
    public static Chessman createChessman(String type) {
        return chessmanPool.get(type);
    }
}
