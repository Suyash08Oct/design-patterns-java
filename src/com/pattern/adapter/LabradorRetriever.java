package com.pattern.adapter;

public class LabradorRetriever implements Dog {
    @Override
    public void bark() {
        System.out.println("Bark!! Bark!!");
    }

    @Override
    public void eat() {
        System.out.println("Eats Pedigree");
    }
}
