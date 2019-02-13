package ObserverPattern_02.displays;

import ObserverPattern_02.WeatherData;

import java.util.Observable;
import java.util.Observer;

// Displays the current weather conditions
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        weatherData = (WeatherData) observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            temperature = weatherData.getTemperature();
            humidity = weatherData.getHumidity();

            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
