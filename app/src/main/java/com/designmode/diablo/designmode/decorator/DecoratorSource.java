package com.designmode.diablo.designmode.decorator;

/**
 * Created by yonghe.shen on 2017/1/13.
 */

public class DecoratorSource implements DecoratorSourceable{
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
