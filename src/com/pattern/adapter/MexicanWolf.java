package com.pattern.adapter;

public class MexicanWolf implements Wolf {
    @Override
    public void howl() {
        System.out.println("Howl!! Howl!!");
    }

    @Override
    public void eat() {
        System.out.println("Eats Meat");
    }
}
