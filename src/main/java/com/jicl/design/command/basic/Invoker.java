package com.jicl.design.command.basic;

/**
 * 请求发送者
 *
 * @author : xianzilei
 * @date : 2020/9/10 9:24
 */
public class Invoker {
    private Command openCommand;
    private Command shutdownCommand;
    private Command resetCommand;

    public void setOpenCommand(Command openCommand) {
        this.openCommand = openCommand;
    }

    public void setShutdownCommand(Command shutdownCommand) {
        this.shutdownCommand = shutdownCommand;
    }

    public void setResetCommand(Command resetCommand) {
        this.resetCommand = resetCommand;
    }

    public void runOpenCommand() {
        System.out.println("invoker触发open命令...");
        openCommand.execute();
    }

    public void runShutdownCommand() {
        System.out.println("invoker触发shutdown命令...");
        shutdownCommand.execute();
    }

    public void runResetCommand() {
        System.out.println("invoker触发reset命令...");
        resetCommand.execute();
    }
}
