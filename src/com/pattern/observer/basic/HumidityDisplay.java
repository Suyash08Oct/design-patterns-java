package com.pattern.observer.basic;

public class HumidityDisplay implements Observer, Display {

    private float humidity;
    private Subject weatherData;

    public HumidityDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("The Humidity is: " + this.humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.humidity = humidity;
        display();
    }
}
