package com.csy.design.factory.abstractfactory;

/**
 * <p>Description：</p>
 *
 * @author shuyun.cheng
 * @date 2021/8/18 18:21
 */
public class BaseFactory implements HardWare {
    private HardWare hardWare;

    public BaseFactory() {
        super();
    }

    public BaseFactory(HardWare hardWare) {
        this.hardWare = hardWare;
    }

    @Override
    public KeyBoard getKeyBoard() {
        return hardWare.getKeyBoard();
    }

    @Override
    public Mouse getMouse() {
        return hardWare.getMouse();
    }
}
