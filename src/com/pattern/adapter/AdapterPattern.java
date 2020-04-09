package com.pattern.adapter;

public class AdapterPattern {
    public static void main(String... s) {
        Wolf wolf = new MexicanWolf();
        wolf.howl();
        wolf.eat();

        System.out.println("*************************************");

        Dog dog = new LabradorRetriever();
        dog.bark();
        dog.eat();

        System.out.println("*************************************");

        Dog adapter = new SiberianHuskyAdapter(wolf);
        adapter.bark();
        adapter.eat();
    }
}
