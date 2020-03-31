package com.pattern.strategy;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak!! Squeak!!");
    }
}
