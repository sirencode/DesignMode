package com.designmode.diablo.designmode.observer;

/**
 * Created by yonghe.shen on 2017/1/13.
 */

public class Observer1 implements Observer {

    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }
}
