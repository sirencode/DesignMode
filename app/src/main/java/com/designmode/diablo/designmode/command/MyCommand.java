package com.designmode.diablo.designmode.command;

/**
 * Created by yonghe.shen on 2017/1/13.
 */

public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}