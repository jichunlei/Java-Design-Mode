package com.jicl.design.command.basic;

/**
 * 业务真正执行者
 *
 * @author : xianzilei
 * @date : 2020/9/10 9:22
 */
public interface MainBoardReceiver {
    void open();

    void shutdown();

    void reset();
}
