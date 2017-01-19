package com.designmode.diablo.designmode.factory;

/**
 * Created by yonghe.shen on 2017/1/13.
 */

public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
