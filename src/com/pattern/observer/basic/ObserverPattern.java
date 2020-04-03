package com.pattern.observer.basic;

public class ObserverPattern {
    public static void main(String... s){
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);
        HumidityDisplay humidityDisplay = new HumidityDisplay(weatherData);

        weatherData.setMeasurements(21.3f, 84, 30.4f);

        weatherData.removeObserver(humidityDisplay);

        weatherData.setMeasurements(15.3f, 64, 67.4f);

        weatherData.removeObserver(conditionDisplay);

        weatherData.setMeasurements(7.3f, 23, 43.4f);


    }
}
