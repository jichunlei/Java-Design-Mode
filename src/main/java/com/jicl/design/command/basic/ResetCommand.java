package com.jicl.design.command.basic;

/**
 * 实际命令类--重启
 *
 * @author : xianzilei
 * @date : 2020/9/10 14:54
 */
public class ResetCommand implements Command {
    private MainBoardReceiver mainBoardReceiver;

    public ResetCommand(MainBoardReceiver mainBoardReceiver) {
        this.mainBoardReceiver = mainBoardReceiver;
    }

    @Override
    public void execute() {
        System.out.println("command调用主板执行reset命令...");
        mainBoardReceiver.reset();
    }
}
