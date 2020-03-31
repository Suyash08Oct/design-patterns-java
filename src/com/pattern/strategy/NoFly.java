package com.pattern.strategy;

public class NoFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Can't Fly");
    }
}
