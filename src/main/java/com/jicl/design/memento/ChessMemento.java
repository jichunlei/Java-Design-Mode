package com.jicl.design.memento;

/**
 * 象棋备忘录
 *
 * @author : xianzilei
 * @date : 2020/11/12 17:45
 */
public class ChessMemento {
    /**
     * 象棋类型
     */
    private String type;

    /**
     * 横坐标
     */
    private int x;

    /**
     * 纵坐标
     */
    private int y;

    public ChessMemento(String type, int x, int y) {
        this.type = type;
        this.x = x;
        this.y = y;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
