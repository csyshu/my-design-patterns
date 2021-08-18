package com.csy.design.factory.simplefactory;

import com.csy.design.factory.OperationAdd;
import com.csy.design.factory.OperationMul;

/**
 * <p>Description：</p>
 *
 * @author csy
 * @date 2021/8/18 11:16
 */
public class NoFactory {
    public static void main(String[] args) {
        //计算两数之和
        OperationAdd operationAdd = new OperationAdd();
        operationAdd.setValue1(1);
        operationAdd.setValue2(2);
        System.out.println("sum:"+operationAdd.getResult());
        //计算两数乘积
        OperationMul operationMul = new OperationMul();
        operationMul.setValue1(3);
        operationMul.setValue2(5);
        System.out.println("multiply:"+operationMul.getResult());
        //计算两数之差。。。
    }
}
