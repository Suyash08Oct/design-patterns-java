package com.pattern.factory;

import com.pattern.factory.creator.DominosPizzaFactory;
import com.pattern.factory.creator.PizzaFactory;
import com.pattern.factory.creator.PizzaHutFactory;
import com.pattern.factory.product.Pizza;

public class FactoryPattern {
    public static void main(String... s){
        // Building Factories
        PizzaFactory dominos = new DominosPizzaFactory();
        PizzaFactory pizzahut = new PizzaHutFactory();

        dominos.orderPizza("Cheese");
        System.out.println("***********************************");
        pizzahut.orderPizza("Non Veg");
    }
}
