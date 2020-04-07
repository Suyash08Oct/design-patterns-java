package com.pattern.decorator;

public class DecoratorPattern {
    public static void main (String... s) {
        Beverage espresso = new Espresso();
        System.out.println(" Ordered " + espresso.getDescription() + ", Cost " + espresso.cost());

        Beverage houseBlend = new HouseBlend();
        // Wrapping/Decorating the Object with the same reference
        houseBlend = new SteamedMilk(houseBlend);
        houseBlend = new Mocha(houseBlend);

        System.out.println(" Ordered " + houseBlend.getDescription() + ", Cost " + houseBlend.cost());


    }
}
