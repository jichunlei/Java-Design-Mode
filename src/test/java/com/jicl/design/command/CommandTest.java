package com.jicl.design.command;

import com.jicl.design.command.basic.*;

/**
 * 命令模式测试
 *
 * @author : xianzilei
 * @date : 2020/9/10 9:26
 */
public class CommandTest {
    public static void main(String[] args) {
        MainBoardReceiver mainBoardReceiver = new DellMainBoardMainBoardReceiver();
        Command openCommand = new OpenCommand(mainBoardReceiver);
        Command shutdownCommand = new ShutdownCommand(mainBoardReceiver);
        Command resetCommand = new ResetCommand(mainBoardReceiver);

        Invoker invoker = new Invoker();
        invoker.setOpenCommand(openCommand);
        invoker.setShutdownCommand(shutdownCommand);
        invoker.setResetCommand(resetCommand);

        invoker.runOpenCommand();
        invoker.runResetCommand();
        invoker.runShutdownCommand();
    }
}
