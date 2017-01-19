package com.designmode.diablo.designmode.iterator;

/**
 * Created by yonghe.shen on 2017/1/13.
 */

public class MyCollection implements Collection {

    public String string[] = { "A", "B", "C", "D", "E" };

    @Override
    public IteratorTmp iterator() {
        return new MyIteratorTmp(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}
