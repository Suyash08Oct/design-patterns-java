package com.pattern.factory.product;

public abstract class Pizza {
    public String name;
    public String sauce;
    public String type;
    public String complementryDrink;

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking for 25 Mins at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void serve() {
        System.out.println("Serving pizza with the Complementary Drink " + complementryDrink);
    }

    public void box() {
        System.out.println("Packing pizza with the Complementary Drink " + complementryDrink);
    }
}
