package com.jicl.design.command.basic;

/**
 * 戴尔电脑主板操作类
 *
 * @author : xianzilei
 * @date : 2020/9/10 14:48
 */
public class DellMainBoardMainBoardReceiver implements MainBoardReceiver {

    @Override
    public void open() {
        System.out.println("戴尔电脑开机...");
    }

    @Override
    public void shutdown() {
        System.out.println("戴尔电脑关机...");
    }

    @Override
    public void reset() {
        System.out.println("戴尔电脑重启...");
    }
}
