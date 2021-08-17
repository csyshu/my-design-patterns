package com.csy.design.singleton;

/**
 * <p>Description：
 * 懒汉式，线程不安全
 * </p>
 *
 * @author csy
 * @date 2021/8/17 17:41
 */
public class Lazy {
    private static Lazy lazy;

    private Lazy() {
    }

    public static Lazy getInstance() {
        if (lazy == null) {
            lazy = new Lazy();
        }
        return lazy;
    }

}
