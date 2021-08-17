package com.csy.design.singleton;

/**
 * <p>Description：
 * 懒汉式，线程安全，性能差
 * </p>
 *
 * @author csy
 * @date 2021/8/17 17:41
 */
public class ThreadSaveLazy {
    private static ThreadSaveLazy lazy;

    private ThreadSaveLazy() {
    }

    public static synchronized ThreadSaveLazy getInstance() {
        if (lazy == null) {
            lazy = new ThreadSaveLazy();
        }
        return lazy;
    }

}
