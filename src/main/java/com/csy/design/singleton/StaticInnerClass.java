package com.csy.design.singleton;

/**
 * <p>Description：</p>
 *
 * @author csy
 * @date 2021/8/17 18:05
 */
public class StaticInnerClass {

    private StaticInnerClass() {
    }

    private static class SingletonHolder {
        private static final StaticInnerClass INSTANCE = new StaticInnerClass();
    }

    public static StaticInnerClass getUniqueInstance() {
        return SingletonHolder.INSTANCE;
    }
}
