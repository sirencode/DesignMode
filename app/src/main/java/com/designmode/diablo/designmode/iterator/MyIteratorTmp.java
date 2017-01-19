package com.designmode.diablo.designmode.iterator;

/**
 * Created by yonghe.shen on 2017/1/13.
 */

public class MyIteratorTmp implements IteratorTmp {

    private Collection collection;
    private int pos = -1;

    public MyIteratorTmp(Collection collection){
        this.collection = collection;
    }

    @Override
    public Object previous() {
        if(pos > 0){
            pos--;
        }
        return collection.get(pos);
    }

    @Override
    public Object next() {
        if(pos<collection.size()-1){
            pos++;
        }
        return collection.get(pos);
    }

    @Override
    public boolean hasNext() {
        if(pos<collection.size()-1){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object first() {
        pos = 0;
        return collection.get(pos);
    }

}
