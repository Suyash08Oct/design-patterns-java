package com.pattern.facade;

public class Light {
    public void on() {
        System.out.println("Light is ON!");
    }

    public void off() {
        System.out.println("Light is OFF!");
    }

    public void dim(int percentage) {
        System.out.println("Light is dim to " + percentage + "%");
    }
}
