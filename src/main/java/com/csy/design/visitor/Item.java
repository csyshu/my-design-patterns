package com.csy.design.visitor;

public class Item implements Element {

    private final String name;

    Item(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}