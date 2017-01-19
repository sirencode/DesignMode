package com.designmode.diablo.designmode.factory;

/**
 * Created by yonghe.shen on 2017/1/13.
 */

public enum SenderType {
    //文章
    SmsSender("sms"),
    //公告
    MailSender("mail");
    private String value = "";

    private SenderType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
