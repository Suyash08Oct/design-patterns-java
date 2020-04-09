package com.pattern.facade;

public class Television {

    private PenDrive penDrive;

    public Television(PenDrive penDrive) {
        this.penDrive = penDrive;
    }

    public void on() {
        System.out.println("Television is ON!");
    }

    public void off() {
        System.out.println("Television is OFF!");
    }

    public void playMovie() {
        System.out.println("Playing Movie " + this.penDrive.getMovieName());
    }
}
