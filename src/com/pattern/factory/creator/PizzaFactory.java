package com.pattern.factory.creator;

import com.pattern.factory.product.Pizza;

public abstract class PizzaFactory {

    public void orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.bake();
        pizza.prepare();
        pizza.cut();
        pizza.box();
    }

    protected abstract Pizza createPizza(String type);
}
