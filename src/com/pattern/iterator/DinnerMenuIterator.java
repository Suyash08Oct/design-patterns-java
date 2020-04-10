package com.pattern.iterator;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator {
    private MenuItem[] menuItems;
    int position = 0;

    public DinnerMenuIterator(MenuItem[] items) {
        this.menuItems = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position = position + 1;
        return menuItem;
    }

}
