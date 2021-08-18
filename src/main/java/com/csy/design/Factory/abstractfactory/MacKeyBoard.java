package com.csy.design.factory.abstractfactory;

/**
 * <p>Description：</p>
 *
 * @author csy
 * @date 2021/8/18 17:50
 */
public class MacKeyBoard implements KeyBoard {
    @Override
    public void input() {
        System.out.println("Input Mac");
    }
}
