package com.pattern.observer.util;

import com.pattern.observer.basic.Display;

import java.util.Observable;
import java.util.Observer;

public class EnglishNewspaperSubscriber implements Observer, Display {

    private Observable publisher;

    private String headlines;

    public EnglishNewspaperSubscriber (Observable publisher) {
        this.publisher = publisher;
        publisher.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Todays Headlins: " + headlines);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof NewspaperPublisher) {
            NewspaperPublisher publisher = (NewspaperPublisher) o;
            this.headlines = publisher.getHeadlinesEnglish();
            display();
        }
    }
}
