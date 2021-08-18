package com.csy.design.factory.abstractfactory;

/**
 * <p>Description：</p>
 *
 * @author csy
 * @date 2021/8/18 17:45
 */
public class WindowsFactory implements HardWare {

    @Override
    public KeyBoard getKeyBoard() {
        return new WinKeyBoard();
    }

    @Override
    public Mouse getMouse() {
        return new WinMouse();
    }
}
