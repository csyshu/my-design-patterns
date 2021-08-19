package com.csy.design.iterator;

public class ConcreteIterator implements Iterator {

    private final Object[] items;
    private int position = 0;

    public ConcreteIterator(Object[] items) {
        this.items = items;
    }

    @Override
    public Object next() {
        return items[position++];
    }

    @Override
    public boolean hasNext() {
        return position < items.length;
    }
}
