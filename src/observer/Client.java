package observer;

/**
 * @author EricRaww
 * @create 2021-02-17
 */
public class Client {
    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();
        WeatherData weatherData = new WeatherData(currentConditions);
        weatherData.setData(20,150,40);
    }
}
