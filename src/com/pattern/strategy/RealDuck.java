package com.pattern.strategy;

public class RealDuck extends Duck {

    @Override
    public void swim() {
        System.out.println("Real Duck Swims");
    }

    @Override
    public void display() {
        System.out.println("Looks Nice and Big");
    }

}
