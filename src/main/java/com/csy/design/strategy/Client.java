package com.csy.design.strategy;

public class Client {

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.setQuackBehavior(new Squeak());
        duck.performQuack();
        System.out.println("------");
        duck.setQuackBehavior(new Quack());
        duck.performQuack();
    }
}