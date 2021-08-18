package com.csy.design.factory.simplefactory;

import com.csy.design.factory.Operation;

/**
 * <p>Description：</p>
 *
 * @author csy
 * @date 2021/8/18 11:29
 */
public class FactoryTest {

    public static void main(String[] args) {
        Operation operationAdd = Client.createOperation("add");
        operationAdd.setValue1(1);
        operationAdd.setValue2(2);
        System.out.println(operationAdd.getResult());
    }
}
