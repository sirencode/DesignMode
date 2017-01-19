package com.designmode.diablo.designmode.factory;

/**
 * Created by yonghe.shen on 2017/1/13.
 */

public class SenderMutilFactory {
    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
