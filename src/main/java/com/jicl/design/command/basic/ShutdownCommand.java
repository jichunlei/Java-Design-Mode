package com.jicl.design.command.basic;

import java.util.Iterator;

/**
 * 实际命令类--关机
 *
 * @author : xianzilei
 * @date : 2020/9/10 14:52
 */
public class ShutdownCommand implements Command {
    private MainBoardReceiver mainBoardReceiver;

    public ShutdownCommand(MainBoardReceiver mainBoardReceiver) {
        this.mainBoardReceiver = mainBoardReceiver;
    }

    @Override
    public void execute() {
        System.out.println("command调用主板执行shutdown命令...");
        mainBoardReceiver.shutdown();
    }
}
