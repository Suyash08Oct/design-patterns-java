package com.pattern.state;

public class IdleState implements State {

    ATMMachine atmMachine;

    public IdleState(ATMMachine machine) {
        this.atmMachine = machine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card Inserted..");
        atmMachine.setState(atmMachine.getContainsCard());
    }

    @Override
    public void ejectCard() {
        System.out.println("Please insert the card first..");
    }

    @Override
    public void processing(int amount) {
        System.out.println("Please insert the card first..");
    }

    @Override
    public void dispenseCash() {
        System.out.println("Please insert the card first..");
    }
}
