package com.pattern.command;

public class Light {

    private boolean status = false;

    public void toggleLight() {
        if (!status) {
            status = true;
            System.out.println("Light is ON!");
        } else {
            status = false;
            System.out.println("Light is Off");
        }
    }
}
