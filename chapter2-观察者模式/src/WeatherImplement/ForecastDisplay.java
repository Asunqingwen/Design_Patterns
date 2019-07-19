package WeatherImplement;

import WeatherInterface.DisplayElement;
import WeatherInterface.Observer;
import WeatherInterface.Subject;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/19 0019 11:38
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 30.0f;
    private float lastPressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }

    public void display() {
        if (currentPressure > lastPressure){
            System.out.println("Forecast: Improving weather on the way!");
        }else if(currentPressure == lastPressure){
            System.out.println("Forecast: More of the same!");
        }else if (currentPressure < lastPressure){
            System.out.println("Forecast: Wath out for cooler,rainy weather!");
        }
    }
}
