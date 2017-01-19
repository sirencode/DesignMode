package com.designmode.diablo.designmode.bridge;

/**
 * Created by yonghe.shen on 2017/1/13.
 * 桥接模式就是把事物和其具体实现分开，使他们可以各自独立的变化。
 * 桥接的用意是：将抽象化与实现化解耦，使得二者可以独立变化
 */

public abstract class Bridge {
    private BridgeSourceable source;

    public void method() {
        source.method();
    }

    public BridgeSourceable getSource() {
        return source;
    }

    public void setSource(BridgeSourceable source) {
        this.source = source;
    }
}
