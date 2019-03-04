package Ch_02_ObserverPattern.displays;

import Ch_02_ObserverPattern.WeatherData;

import java.util.Observable;
import java.util.Observer;

// Displays the weather forecast
public class ForecastDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;
    private float currentPressure = 29.2f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        weatherData = (WeatherData) observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();

            display();
        }
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
