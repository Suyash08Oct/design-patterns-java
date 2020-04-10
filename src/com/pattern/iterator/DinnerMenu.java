package com.pattern.iterator;

import java.util.Iterator;

public class DinnerMenu implements Menu {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;

    MenuItem[] menuItems;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian Biryani", "Paneer added Biryani with special spices",
                true, 300.99);

        addItem("Soup of the day", "Added Ginger and Tomato for special effects",
                true, 178.56);

        addItem("Hotdog", "A hot dog with saurkraut, relish onions, and topped with cheese",
                true, 130.98);

        addItem("Chicken Biryani", "Chicken added Biryani, with special spices",
                false, 350.56);
    }

    public void addItem(String name, String description, boolean isVegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, isVegetarian, price);

        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry Menu is full, Can't add new item");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return new DinnerMenuIterator(menuItems);
    }
}
