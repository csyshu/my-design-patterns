package com.csy.design.iterator;

public class ConcreteAggregate implements Aggregate {

    private final Integer[] items;

    public ConcreteAggregate() {
        items = new Integer[10];
        for (int i = 0; i < items.length; i++) {
            items[i] = i;
        }
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(items);
    }
}