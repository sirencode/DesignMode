package com.designmode.diablo.designmode.responsibility;

/**
 * Created by yonghe.shen on 2017/1/13.
 */

public class MyHandler extends AbstractHandler implements ResponsibilityHandler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name+"deal!");
        if(getHandler()!=null){
            getHandler().operator();
        }
    }
}
