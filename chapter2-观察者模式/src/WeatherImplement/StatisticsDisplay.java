package WeatherImplement;

import WeatherInterface.DisplayElement;
import WeatherInterface.Observer;
import WeatherInterface.Subject;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/19 0019 11:34
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemperature = 0.0f;
    private float minTemperature = 300.0f;
    private float sumTemperature = 0.0f;
    private int numRead = 0;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        numRead++;
        sumTemperature += temperature;

        if (temperature > maxTemperature)
            maxTemperature = temperature;

        if (temperature < minTemperature)
            minTemperature = temperature;

        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + sumTemperature / numRead + "/" + maxTemperature + "/" + minTemperature);
    }
}
