package com.csy.design.singleton;

/**
 * <p>Description：双重校验锁懒汉式，线程安全</p>
 *
 * @author csy
 * @date 2021/8/17 18:00
 */
public class DclLazy {
    private volatile static DclLazy lazy;

    private DclLazy() {
    }

    public static synchronized DclLazy getInstance() {
        if (lazy == null) {
            synchronized (DclLazy.class){
                if (lazy==null){
                    lazy = new DclLazy();
                }
            }
        }
        return lazy;
    }
}
