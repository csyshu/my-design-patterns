package com.csy.design.factory.factorymethod;

import com.csy.design.factory.Operation;
import com.csy.design.factory.OperationSub;

//减法类工厂
public class SubFactory implements IFactory {
    @Override
    public Operation createOption() {
        return new OperationSub();
    }
}