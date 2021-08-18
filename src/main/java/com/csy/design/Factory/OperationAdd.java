package com.csy.design.factory;

//加法
public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        return super.getValue1() + super.getValue2();
    }

}