package com.designmode.diablo.designmode.builder;

/**
 * Created by yonghe.shen on 2017/1/13.
 */

public class BuilderTest {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(10);
    }
}
