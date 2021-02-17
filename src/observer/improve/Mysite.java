package observer.improve;

/**
 * @author EricRaww
 * @create 2021-02-17
 */
public class Mysite implements Observer {
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
        System.out.println("Mysite Today temperature is "+ temperature);
        System.out.println("Mysite Today pressure is "+ pressure);
        System.out.println("Mysite Today humidity is "+ humidity);
    }
}
