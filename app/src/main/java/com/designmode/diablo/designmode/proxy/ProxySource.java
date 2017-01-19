package com.designmode.diablo.designmode.proxy;

/**
 * Created by yonghe.shen on 2017/1/13.
 */

public class ProxySource implements ProxySourceable {

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
