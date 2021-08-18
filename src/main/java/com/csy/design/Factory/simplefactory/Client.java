package com.csy.design.factory.simplefactory;

//工厂类

import com.csy.design.factory.Operation;
import com.csy.design.factory.OperationAdd;
import com.csy.design.factory.OperationDiv;
import com.csy.design.factory.OperationMul;
import com.csy.design.factory.OperationSub;

/**
 * 简单工厂，静态方法模式
 * 缺点：当新增产品，需要修改工厂内方法，违背开闭原则
 * @author csy
 * @date 2021-08-18
 */
public class Client {

    public static Operation createOperation(String operation) {
        Operation oper;
        switch (operation) {
            case "add":
                oper = new OperationAdd();
                break;
            case "sub":
                oper = new OperationSub();
                break;
            case "mul":
                oper = new OperationMul();
                break;

            case "div":
                oper = new OperationDiv();
                break;
            default:
                throw new UnsupportedOperationException("不支持该操作");
        }
        return oper;
    }

}