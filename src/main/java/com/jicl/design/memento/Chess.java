package com.jicl.design.memento;

/**
 * 象棋
 *
 * @author : xianzilei
 * @date : 2020/11/12 17:40
 */
public class Chess {

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


    public Chess(String type, int x, int y) {
        this.type = type;
        this.x = x;
        this.y = y;
    }


    /**
     * 移动位置
     *
     * @param x 目标地横坐标
     * @param y 目标地纵坐标
     * @return void
     * @author xianzilei
     * @date 2020/11/12 17:44
     **/
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        display();
    }

    /**
     * 保存当前状态
     *
     * @return com.jicl.design.memento.ChessMemento
     * @author xianzilei
     * @date 2020/11/12 17:48
     **/
    public ChessMemento save() {
        return new ChessMemento(type, x, y);
    }

    /**
     * 恢复状态
     *
     * @param chessMemento 1
     * @return void
     * @author xianzilei
     * @date 2020/11/12 17:49
     **/
    public void restore(ChessMemento chessMemento) {
        if (chessMemento != null) {
            this.type = chessMemento.getType();
            this.x = chessMemento.getX();
            this.y = chessMemento.getY();
        }
        display();
    }

    /**
     * 输出当前棋子信息
     *
     * @return void
     * @author xianzilei
     * @date 2020/11/12 18:14
     **/
    private void display() {
        System.out.println("当前" + type + "棋子位置：(" + x + "," + y + ")");
    }
}
