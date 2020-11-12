package com.jicl.design.memento;

/**
 * TODO
 *
 * @author : xianzilei
 * @date : 2020/11/12 18:07
 */
public class Client {

    public static void main(String[] args) {
        //创建象棋和象棋管理器
        MementoManager mementoManager = new MementoManager();
        Chess chess = new Chess("车", 0, 0);
        //存档
        mementoManager.saveMemento(chess.save());
        //移动棋子并存档
        chess.move(0, 5);
        mementoManager.saveMemento(chess.save());
        //移动棋子并存档
        chess.move(4, 5);
        mementoManager.saveMemento(chess.save());
        //移动棋子并存档
        chess.move(8, 5);
        mementoManager.saveMemento(chess.save());
        //移动棋子并存档
        chess.move(8, 8);
        mementoManager.saveMemento(chess.save());
        //回退
        System.out.println("回退一步，");
        chess.restore(mementoManager.getLastMemento());
        //回退
        System.out.println("回退一步，");
        chess.restore(mementoManager.getLastMemento());
        //回退
        System.out.println("回退一步，");
        chess.restore(mementoManager.getLastMemento());
        //回退
        System.out.println("回退一步，");
        chess.restore(mementoManager.getLastMemento());
        //回退
        System.out.println("回退一步，");
        chess.restore(mementoManager.getLastMemento());
        //撤销回退
        System.out.println("撤销回退一步，");
        chess.restore(mementoManager.getNextMemento());
        //移动棋子并存档
        chess.move(8, 0);
        mementoManager.saveMemento(chess.save());
        //回退
        System.out.println("回退一步，");
        chess.restore(mementoManager.getLastMemento());

    }

}
