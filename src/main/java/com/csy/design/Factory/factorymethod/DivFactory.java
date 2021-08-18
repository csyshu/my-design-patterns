package com.csy.design.factory.factorymethod;

import com.csy.design.factory.Operation;
import com.csy.design.factory.OperationDiv;

//除法类工厂
public class DivFactory implements IFactory {
    @Override
    public Operation createOption() {
        return new OperationDiv();
    }
}