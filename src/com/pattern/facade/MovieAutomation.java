package com.pattern.facade;


public class MovieAutomation {
    private Light light;
    private Television television;
    private PopcornPopper popcornPopper;

    public MovieAutomation(Light light, Television television, PopcornPopper popcornPopper) {
        this.light = light;
        this.television = television;
        this.popcornPopper = popcornPopper;
    }

    public void playMovie() {
        light.on();
        light.dim(10);

        popcornPopper.on();
        popcornPopper.pop();
        popcornPopper.off();

        television.on();
        television.playMovie();
    }

    public void stopMovie() {
        light.off();
        television.off();
    }
}
