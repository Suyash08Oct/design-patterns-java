package com.pattern.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {

    Map<String, MenuItem> menuItems;

    public CafeMenu() {
        this.menuItems = new HashMap<>();

        addItem("Veggie Burger & Air Fries", "Veggie Burger on whole wheat bun, lettuce, tomato and fruits",
                true, 90.78);

        addItem("Tomato Soup", "A cup of soup with the side salad",
                false, 130.00);

        addItem("Burrito", "A large Burrito, with whole pinto beans, salsa and guacamole",
                false, 150.97);

    }

    public void addItem(String name, String description, boolean isVegetarian, double price) {
        MenuItem item = new MenuItem(name, description, isVegetarian, price);
        menuItems.put(item.getName(), item);
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return menuItems.values().iterator();
    }
}
