package com.designmode.diablo.designmode.responsibility;

/**
 * Created by yonghe.shen on 2017/1/13.
 */

public abstract class AbstractHandler {

    private ResponsibilityHandler handler;

    public ResponsibilityHandler getHandler() {
        return handler;
    }

    public void setHandler(ResponsibilityHandler handler) {
        this.handler = handler;
    }

}
