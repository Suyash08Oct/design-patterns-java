package com.pattern.state;

public class CashDispense implements State {
    ATMMachine atmMachine;

    public CashDispense(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card is already present");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card is locked now, as Cash Dispense is in process");
    }

    @Override
    public void processing(int amount) {
        System.out.println("processing..");
    }

    @Override
    public void dispenseCash() {
        System.out.println("Please collect your cash");
        atmMachine.setState(atmMachine.getContainsCard());
        atmMachine.ejectCard();
    }
}
