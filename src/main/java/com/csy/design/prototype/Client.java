package com.csy.design.prototype;

public class Client {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("abc");
        System.out.println("原对象：" + prototype.toString());
        System.out.println("原对象变量值：" + prototype.getFiled());
        ConcretePrototype clone = prototype.myClone();
        System.out.println("拷贝对象：" + clone.toString());
        System.out.println("拷贝对象变量值：" + prototype.getFiled());
    }
}