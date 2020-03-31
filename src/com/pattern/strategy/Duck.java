package com.pattern.strategy;

public abstract class Duck {


    //QuackBehaviour $ FlyBehaviour has been encapsulated into different interface, for the method delegation
    private QuackBehaviour quackBehaviour;

    private FlyBehaviour flyBehaviour;


    public abstract void swim();
    public abstract void display();

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
}
