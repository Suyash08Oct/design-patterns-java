package com.pattern.decorator;

public class Espresso extends Beverage {

    public Espresso () {
        setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 200.50;
    }
}
