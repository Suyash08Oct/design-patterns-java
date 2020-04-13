package com.pattern.state;

public class ContainsCard implements State {

    ATMMachine atmMachine;

    public ContainsCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card is already present, wait for processing");
    }

    @Override
    public void ejectCard() {
        System.out.println("Ejecting Card..");
        atmMachine.setState(atmMachine.getIdleState());
    }

    @Override
    public void processing(int amount) {
        System.out.println("Validating your details..");
        atmMachine.initialBalance = atmMachine.initialBalance - amount;
        if (atmMachine.initialBalance < 0) {
            atmMachine.setState(atmMachine.getOutOfCash());
            atmMachine.ejectCard();
        } else {
            atmMachine.setState(atmMachine.getCashDispense());
        }

    }

    @Override
    public void dispenseCash() {
        System.out.println("Go for processing first");
    }
}
