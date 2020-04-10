package com.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu {

    private List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList<>();

        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast",
                true, 145.35);

        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage",
                false, 200.55);

        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries",
                true, 150.67);

        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries",
                true, 350.45);

    }

    public void addItem(String name, String description, boolean isVegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, isVegetarian, price);
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return menuItems.iterator();
    }
}
