package com.pattern.singleton;

public class SingletonPattern {
    private static SingletonPattern uniqueInstance;

    private SingletonPattern() {}

    public static synchronized SingletonPattern getInstance() {
        if(uniqueInstance == null) {
            return new SingletonPattern();
        }

        return uniqueInstance;
    }
}
