package Ch_02_ObserverPattern;

import Ch_02_ObserverPattern.displays.CurrentConditionsDisplay;
import Ch_02_ObserverPattern.displays.ForecastDisplay;
import Ch_02_ObserverPattern.displays.HeatIndexDisplay;
import Ch_02_ObserverPattern.displays.StatisticsDisplay;

// Used to test our Observer Pattern implementation
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}