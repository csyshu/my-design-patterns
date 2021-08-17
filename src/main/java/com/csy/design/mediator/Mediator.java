package com.csy.design.mediator;

/**
 * 中介者
 * @author csy
 * @date 2021-08-17
 */
public interface Mediator {
    /**
     * 中介方法
     * @param eventType 时间类型
     */
    void doEvent(String eventType);

}