package com.pattern.adapter;

public class SiberianHuskyAdapter implements Dog {

    Wolf wolf;

    public SiberianHuskyAdapter(Wolf wolf) {
        this.wolf = wolf;
    }

    @Override
    public void bark() {
        wolf.howl();
    }

    @Override
    public void eat() {
        wolf.eat();
    }
}
