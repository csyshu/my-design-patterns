package com.csy.design.factory.factorymethod;

import com.csy.design.factory.Operation;
import com.csy.design.factory.OperationMul;

//乘法类工厂
public class MulFactory implements IFactory {
    @Override
    public Operation createOption() {
        return new OperationMul();
    }
}