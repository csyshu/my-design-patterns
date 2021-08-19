package com.csy.design.visitor;

public interface Element {
    void accept(Visitor visitor);
}