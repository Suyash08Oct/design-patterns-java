package com.pattern.observer.util;

import com.pattern.observer.basic.Display;

import java.util.Observable;
import java.util.Observer;

public class HindiNewspaperSubscriber implements Observer, Display {

    private Observable publisher;
    private String headlines;

    public HindiNewspaperSubscriber (Observable publisher) {
        this.publisher = publisher;
        publisher.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("आज की ताज़ा ख़बर :" + headlines);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Observable) {
            NewspaperPublisher publisher = (NewspaperPublisher) o;
            this.headlines = publisher.getHeadlinesHindi();
            display();
        }
    }
}
