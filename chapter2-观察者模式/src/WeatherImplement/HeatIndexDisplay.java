package WeatherImplement;

import WeatherInterface.DisplayElement;
import WeatherInterface.Observer;
import WeatherInterface.Subject;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/19 0019 14:39
 */
public class HeatIndexDisplay implements Observer, DisplayElement {
    private float heatIndex = 0.0f;
    private Subject weatherData;

    public HeatIndexDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        heatIndex = computeHeatIndex(temperature, humidity);

        display();
    }

    private float computeHeatIndex(float T, float RH) {
        float heatindex = (float) ((16.923 + (0.185212 * T) + (5.37941 * RH) - (0.100254 * T * RH)
                + (0.00941695 * (T * T)) + (0.00728898 * (RH * RH))
                + (0.000345372 * (T * T * RH)) - (0.000814971 * (T * RH * RH)) +
                (0.0000102102 * (T * T * RH * RH)) - (0.000038646 * (T * T * T)) + (0.0000291583 *
                (RH * RH * RH)) + (0.00000142721 * (T * T * T * RH)) +
                (0.000000197483 * (T * RH * RH * RH)) - (0.0000000218429 * (T * T * T * RH * RH)) +
                0.000000000843296 * (T * T * RH * RH * RH)) -
                (0.0000000000481975 * (T * T * T * RH * RH * RH)));
        return heatindex;
    }

    @Override
    public void display() {
        System.out.println("Heat index is " + heatIndex);
    }
}
