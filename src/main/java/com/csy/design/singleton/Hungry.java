package com.csy.design.singleton;

/**
 * <p>Description：懒汉式，线程安全</p>
 *
 * @author csy
 * @date 2021/8/17 17:46
 */
public class Hungry {
    private static final Hungry hungry = new Hungry();

    private Hungry() {
    }

    public static Hungry getInstance() {
        return hungry;
    }
}
