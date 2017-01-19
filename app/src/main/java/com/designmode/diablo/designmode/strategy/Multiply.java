package com.designmode.diablo.designmode.strategy;

/**
 * Created by yonghe.shen on 2017/1/13.
 */

public class Multiply extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\*");
        return arrayInt[0]*arrayInt[1];
    }
}

