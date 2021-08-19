package com.csy.design.visitor;

public interface Visitor {
    void visit(Customer customer);

    void visit(Order order);

    void visit(Item item);
}