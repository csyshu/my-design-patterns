package com.csy.design.factory.abstractfactory;

/**
 * <p>Description：</p>
 *
 * @author csy
 * @date 2021/8/18 17:50
 */
public class MacMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("Click Mac");
    }
}
