package com.pattern.factory.creator;

import com.pattern.factory.product.CheeseMargherita;
import com.pattern.factory.product.ChickenDominator;
import com.pattern.factory.product.PeppyPaneer;
import com.pattern.factory.product.Pizza;

public class DominosPizzaFactory extends PizzaFactory {

    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("Cheese")){
            return new CheeseMargherita();
        } else if(type.equals("Veg")) {
            return new PeppyPaneer();
        } else if(type.equals("Non Veg")) {
            return new ChickenDominator();
        }
        return null;
    }
}
