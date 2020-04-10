package com.pattern.iterator;

import java.util.Iterator;

public class Waitress {

    private Menu panCake;
    private Menu cafeMenu;
    private Menu dinnerMenu;

    public Waitress(Menu panCake, Menu dinnerMenu) {
        this.panCake = panCake;
        this.dinnerMenu = dinnerMenu;
    }

    public Waitress(Menu panCake, Menu dinnerMenu, Menu cafeMenu) {
        this.panCake = panCake;
        this.dinnerMenu = dinnerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> panCakeIterator = panCake.iterator();
        Iterator<MenuItem> dinnerMenuIterator = dinnerMenu.iterator();
        Iterator<MenuItem> cafeMenuIterator = cafeMenu.iterator();

        System.out.println("*********Breakfast************");

        printMenu(panCakeIterator);

        System.out.println("*********Cafe Menu************");

        printMenu(cafeMenuIterator);

        System.out.println("*********Dinner************");

        printMenu(dinnerMenuIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem item = (MenuItem) iterator.next();
            System.out.print(item.getName() + ", ");
            System.out.print(item.getPrice() + " -- ");
            System.out.println(item.getDescription());
        }
    }

}
