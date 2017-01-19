package com.designmode.diablo.designmode.iterator;

/**
 * Created by yonghe.shen on 2017/1/13.
 * 两层意思：一是需要遍历的对象，即聚集对象，二是迭代器对象，用于对聚集对象进行遍历访问。
 */

public interface IteratorTmp {
    //前移
    public Object previous();

    //后移
    public Object next();

    public boolean hasNext();

    //取得第一个元素
    public Object first();
}
