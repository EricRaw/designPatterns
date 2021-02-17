package observer.improve;

/**
 * @author EricRaww
 * @create 2021-02-17
 */
public class CurrentConditions implements Observer {
    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    private void display() {
        System.out.println("Today temperature is "+ temperature);
        System.out.println("Today pressure is "+ pressure);
        System.out.println("Today humidity is "+ humidity);
    }
}
