package com.csy.design.template;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * 各子类不同实现
     */
    abstract void brew();
    /**
     * 各子类不同实现
     */
    abstract void addCondiments();
    /**
     * 各子类相同实现
     */
    void boilWater() {
        System.out.println("boilWater");
    }
    /**
     * 各子类相同实现
     */
    void pourInCup() {
        System.out.println("pourInCup");
    }
}