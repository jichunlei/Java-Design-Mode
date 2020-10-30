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
        //定义命令实际的执行者
        MainBoardReceiver mainBoardReceiver = new DellMainBoardMainBoardReceiver();

        //定义开启命令、关机命令和重启命令
        Command openCommand = new OpenCommand(mainBoardReceiver);
        Command shutdownCommand = new ShutdownCommand(mainBoardReceiver);
        Command resetCommand = new ResetCommand(mainBoardReceiver);

        //定义调用者，并放入命令
        Invoker invoker = new Invoker();
        invoker.setOpenCommand(openCommand);
        invoker.setShutdownCommand(shutdownCommand);
        invoker.setResetCommand(resetCommand);

        //命令执行
        invoker.runOpenCommand();
        invoker.runResetCommand();
        invoker.runShutdownCommand();
    }
}
