package com.csy.design.prototype;

/**
 * @author shuyun.cheng
 */
public class ConcretePrototype implements Prototype {

    private String filed;

    public String getFiled() {
        return filed;
    }

    public ConcretePrototype(String filed) {
        this.filed = filed;
    }

    @Override
    public ConcretePrototype myClone() {
        return new ConcretePrototype(filed);
    }

}