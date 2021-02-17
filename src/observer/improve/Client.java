package observer.improve;

import java.util.Observable;
import java.util.Observer;

/**
 * @author EricRaww
 * @create 2021-02-17
 */
public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.setData(30,150,80);
        weatherData.registerObserver(new CurrentConditions());
        Mysite mysite = new Mysite();
        weatherData.registerObserver(mysite);
        weatherData.notifyObservers();
    }
}
