package com.designmode.diablo.designmode.bridge;

/**
 * Created by yonghe.shen on 2017/1/13.
 */

public class MyBridge extends Bridge {
    public void method() {
        getSource().method();
    }
}
