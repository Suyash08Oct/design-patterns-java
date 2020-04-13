package com.pattern.state;

public class Customer {
    public static void main(String... s) {
        ATMMachine atmMachine = new ATMMachine(5000);

        atmMachine.insertCard();
        atmMachine.ejectCard();

        atmMachine.insertCard();
        atmMachine.processing(2000);
        atmMachine.dispenseCash();

        atmMachine.insertCard();
        atmMachine.ejectCard();
        atmMachine.processing(2000);
        atmMachine.dispenseCash();

        atmMachine.insertCard();
        atmMachine.processing(3000);
        atmMachine.ejectCard();
        atmMachine.dispenseCash();

        atmMachine.insertCard();
        atmMachine.processing(10);
        atmMachine.dispenseCash();
    }
}
