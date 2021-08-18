package com.csy.design.factory.factorymethod;


import com.csy.design.factory.Operation;

//工厂接口
public interface IFactory {
    Operation createOption();
}