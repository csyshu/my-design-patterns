package com.csy.design.factory;

//乘法
public class OperationMul extends Operation {
    @Override
    public double getResult() {
        return getValue1() * getValue2();
    }
}