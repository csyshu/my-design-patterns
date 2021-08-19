package com.csy.design.decorator;

public class Client {

    public static void main(String[] args) {
        // 1
        Beverage beverage = new HouseBlend();
        // 2
        beverage = new Mocha(beverage);
        // 3
        beverage = new Milk(beverage);
        System.out.println(beverage.cost());
    }
}