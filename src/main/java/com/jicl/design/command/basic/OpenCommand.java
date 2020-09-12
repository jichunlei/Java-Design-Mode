package com.jicl.design.command.basic;

/**
 * 实际命令类--开机
 *
 * @author : xianzilei
 * @date : 2020/9/10 9:21
 */
public class OpenCommand implements Command {
    private MainBoardReceiver mainBoardReceiver;


    public OpenCommand(MainBoardReceiver mainBoardReceiver) {
        this.mainBoardReceiver = mainBoardReceiver;
    }

    @Override
    public void execute() {
        System.out.println("command调用主板执行open命令...");
        mainBoardReceiver.open();
    }
}
