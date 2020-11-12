package com.jicl.design.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 备忘录管理器
 *
 * @author : xianzilei
 * @date : 2020/11/12 17:50
 */
public class MementoManager {

    /**
     * 存放一系列的备忘录信息
     */
    private List<ChessMemento> mementos = new ArrayList<>();

    /**
     * 游标
     */
    private int index = -1;

    /**
     * 获取当前的回退状态
     *
     * @return com.jicl.design.memento.ChessMemento
     * @author xianzilei
     * @date 2020/11/12 17:55
     **/
    public ChessMemento getLastMemento() {
        if (index <= 0) {
            return null;
        }
        return mementos.get(--index);
    }

    /**
     * 获取当前的下一状态
     *
     * @return com.jicl.design.memento.ChessMemento
     * @author xianzilei
     * @date 2020/11/12 18:01
     **/
    public ChessMemento getNextMemento() {
        if (index >= mementos.size() - 1) {
            return null;
        }
        return mementos.get(++index);
    }

    /**
     * 保存状态
     *
     * @param memento 1
     * @return void
     * @author xianzilei
     * @date 2020/11/12 18:47
     **/
    public void saveMemento(ChessMemento memento) {
        mementos.add(memento);
        index++;
    }
}
