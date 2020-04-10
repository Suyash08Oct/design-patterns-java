package com.pattern.iterator;

public class IteratorPattern {
    public static void main(String... s) {
        PancakeHouseMenu pancake = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancake, dinnerMenu, cafeMenu);
        waitress.printMenu();
    }
}
