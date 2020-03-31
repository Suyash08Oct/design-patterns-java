package com.pattern.strategy;

public class RubberDuck extends Duck {

    //If I feel that, it is needed to use Fly and Quack Behaviour, then we can instantiate it.

    @Override
    public void swim() {
        System.out.println("Rubber Duck Swims");
    }

    @Override
    public void display() {
        System.out.println("Looks Cute");
    }
}
