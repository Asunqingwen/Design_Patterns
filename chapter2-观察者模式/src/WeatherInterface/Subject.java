package WeatherInterface;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/19 0019 10:49
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
