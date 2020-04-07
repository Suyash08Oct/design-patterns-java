package com.pattern.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend () {
        setDescription("HouseBlend");
    }

    @Override
    public double cost() {
        return 150.75;
    }
}
