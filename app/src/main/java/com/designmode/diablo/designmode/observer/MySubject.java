package com.designmode.diablo.designmode.observer;

/**
 * Created by yonghe.shen on 2017/1/13.
 */

public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}

