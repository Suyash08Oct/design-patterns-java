package com.pattern.state;

public class ATMMachine {
    State idleState;
    State containsCard;
    State cashDispense;
    State outOfCash;

    State state;
    int initialBalance;

    public ATMMachine(int initialBalance) {
        this.initialBalance = initialBalance;
        this.idleState = new IdleState(this);
        this.containsCard = new ContainsCard(this);
        this.cashDispense = new CashDispense(this);
        this.outOfCash = new OutOfCash(this);
        this.state = new IdleState(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertCard() {
        state.insertCard();
    }

    public void ejectCard() {
        state.ejectCard();
    }

    public void processing(int amount) {
        state.processing(amount);
    }

    public void dispenseCash() {
        state.dispenseCash();
    }

    public State getIdleState() {
        return idleState;
    }

    public State getContainsCard() {
        return containsCard;
    }

    public State getCashDispense() {
        return cashDispense;
    }

    public State getOutOfCash() {
        return outOfCash;
    }

    public int getInitialBalance() {
        return initialBalance;
    }
}
