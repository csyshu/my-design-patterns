package com.csy.design.factory.factorymethod;

import com.csy.design.factory.Operation;
import com.csy.design.factory.OperationAdd;

//加法类工厂
public class AddFactory implements IFactory {
    @Override
    public Operation createOption() {
        return new OperationAdd();
    }
}