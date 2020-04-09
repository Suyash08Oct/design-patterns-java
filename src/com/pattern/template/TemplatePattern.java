package com.pattern.template;

public class TemplatePattern {
    public static void main(String... s) {
        Tea myTea = new Tea();
        myTea.prepareRecipe();

        System.out.println("*************************");

        Coffee myCoffee = new Coffee();
        myCoffee.prepareRecipe();
    }
}
