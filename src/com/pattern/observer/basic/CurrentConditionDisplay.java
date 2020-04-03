package com.pattern.observer.basic;

public class CurrentConditionDisplay implements Observer, Display {

    private float temperature;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Temperature is " + this.temperature + " And Pressure is " + this.pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        display();
    }
}
