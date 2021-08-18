package com.csy.design.factory.factorymethod;

import com.csy.design.factory.Operation;

/**
 * <p>
 * Description：工厂方法，完全符合开闭原则
 *
 * </p>
 *
 * @author csy
 * @date 2021/8/18 16:42
 */
public class Client {
    public static void main(String[] args) {
        //减法
        IFactory subFactory = new SubFactory();
        Operation operationSub = subFactory.createOption();
        operationSub.setValue1(22);
        operationSub.setValue2(20);
        System.out.println("sub:" + operationSub.getResult());
        //除法
        IFactory divFactory = new DivFactory();
        Operation operationDiv = divFactory.createOption();
        operationDiv.setValue1(99);
        operationDiv.setValue2(33);
        System.out.println("div:" + operationSub.getResult());
    }
}
