package com.pattern.observer.util;

import java.util.Observable;

public class NewspaperPublisher extends Observable {

    private String headlinesEnglish;
    private String headlinesHindi;

    public String getHeadlinesEnglish(){
        return headlinesEnglish;
    }

    public String getHeadlinesHindi() {
        return headlinesHindi;
    }

    public void setHeadlines (String headlinesEnglish, String headlinesHindi) {
        this.headlinesEnglish = headlinesEnglish;
        this.headlinesHindi = headlinesHindi;
        newspaperPublished();
    }

    public void newspaperPublished() {
        setChanged();
        notifyObservers();
    }
}
