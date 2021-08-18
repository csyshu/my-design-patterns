package com.csy.design.factory.abstractfactory;

/**
 * <p>Description：</p>
 *
 * @author csy
 * @date 2021/8/18 17:45
 */
public  class MacFactory implements HardWare{

    @Override
    public KeyBoard getKeyBoard() {
        return new MacKeyBoard();
    }

    @Override
    public Mouse getMouse() {
        return new MacMouse();
    }
}
