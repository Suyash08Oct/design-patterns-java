package com.pattern.factory.creator;

import com.pattern.factory.product.*;

public class PizzaHutFactory extends PizzaFactory {

    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("Cheese")){
            return new HandTossed();
        } else if(type.equals("Veg")) {
            return new SupremePizza();
        } else if(type.equals("Non Veg")) {
            return new ChickenSupremePizza();
        }
        return null;
    }
}
