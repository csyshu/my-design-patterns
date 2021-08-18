package com.csy.design.factory;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Operation {
    private double value1 = 0;
    private double value2 = 0;

    public abstract double getResult();
}