package com.csy.design.factory.abstractfactory;

/**
 * <p>Description：</p>
 *
 * @author csy
 * @date 2021/8/18 17:50
 */
public class WinKeyBoard implements KeyBoard{
    @Override
    public void input() {
        System.out.println("Input Win");
    }
}
