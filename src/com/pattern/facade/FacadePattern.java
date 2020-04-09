package com.pattern.facade;

public class FacadePattern {
    public static void main(String... s) {
        Light light = new Light();
        PenDrive penDrive = new PenDrive("Sherlock Homes");
        Television television = new Television(penDrive);
        PopcornPopper popcornPopper = new PopcornPopper();

        MovieAutomation automation = new MovieAutomation(light, television, popcornPopper);

        automation.playMovie();
        System.out.println("********************************");
        automation.stopMovie();
    }
}
