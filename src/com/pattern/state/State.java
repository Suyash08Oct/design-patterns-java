package com.pattern.state;

public interface State {
    void insertCard();

    void ejectCard();

    void processing(int amount);

    void dispenseCash();
}
