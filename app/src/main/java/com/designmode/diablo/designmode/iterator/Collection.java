package com.designmode.diablo.designmode.iterator;

/**
 * Created by yonghe.shen on 2017/1/13.
 */

public interface Collection {

    public IteratorTmp iterator();

    /*取得集合元素*/
    public Object get(int i);

    /*取得集合大小*/
    public int size();
}
