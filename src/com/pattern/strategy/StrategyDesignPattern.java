package com.pattern.strategy;

public class StrategyDesignPattern {

    public static void main(String... s) {

        System.out.println("Rubber Duck Behaviour");

        System.out.println("****************************************");
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.swim();
        System.out.println("****************************************");

        System.out.println("Real Duck Behaviour");

        System.out.println("****************************************");
        Duck realDuck = new RealDuck();
        // Real Duck can fly
        realDuck.setFlyBehaviour(new FlyWithWings());
        // Real Duck can quack
        realDuck.setQuackBehaviour(new Quack());

        realDuck.swim();
        realDuck.performFly();
        realDuck.display();
        realDuck.performQuack();
        System.out.println("****************************************");

    }
}
