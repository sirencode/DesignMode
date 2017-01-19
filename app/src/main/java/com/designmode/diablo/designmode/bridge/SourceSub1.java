package com.designmode.diablo.designmode.bridge;

/**
 * Created by yonghe.shen on 2017/1/13.
 */

public class SourceSub1 implements BridgeSourceable {

    @Override
    public void method() {
        System.out.println("this is the first sub!");
    }
}
