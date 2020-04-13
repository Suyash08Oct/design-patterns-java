package com.pattern.state;

public class OutOfCash implements State {

    public OutOfCash(ATMMachine atmMachine) {
    }

    @Override
    public void insertCard() {
        System.out.println("Out of Cash.. Thank You.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Ejecting Card.. Thank You.");
    }

    @Override
    public void processing(int amount) {
        System.out.println("Out of Cash.. Thank You.");
    }

    @Override
    public void dispenseCash() {
        System.out.println("Out of Cash.. Thank You.");
    }
}
