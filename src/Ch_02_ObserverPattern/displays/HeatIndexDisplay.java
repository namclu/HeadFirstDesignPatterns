package Ch_02_ObserverPattern.displays;

import Ch_02_ObserverPattern.WeatherData;

import java.util.Observable;
import java.util.Observer;


// Displays the heat index info
public class HeatIndexDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;
    private float temperature;
    private float humidity;

    public HeatIndexDisplay(Observable observable) {
        weatherData = (WeatherData) observable;
        observable.addObserver(this);
    }

    // Calculate the heat index
    private float computeHeatIndex(float t, float rh) {
        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
                (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
                (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
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
        System.out.println("Heat index is " + computeHeatIndex(temperature, humidity));
    }
}
