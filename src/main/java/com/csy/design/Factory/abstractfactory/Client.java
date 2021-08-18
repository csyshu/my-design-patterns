package com.csy.design.factory.abstractfactory;

/**
 * <p>Description：</p>
 *
 * @author csy
 * @date 2021/8/18 17:55
 */
public class Client {
    public static void main(String[] args) {
        MacFactory macFactory = new MacFactory();
        BaseFactory baseFactory = new BaseFactory(macFactory);
        baseFactory.getKeyBoard().input();
        baseFactory.getMouse().click();
    }
}
