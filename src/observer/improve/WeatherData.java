package observer.improve;

import java.util.ArrayList;

/**
 * @author EricRaww
 * @create 2021-02-17
 */
public class WeatherData implements Subject {
    private float temperature;
    private float pressure;
    private float humidity;
    private ArrayList<Observer> arrayList;

    public void setData(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    public void dataChange(){
       notifyObservers();
    }

    public WeatherData() {
        arrayList= new ArrayList<Observer>(5);
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    @Override
    public void registerObserver(Observer o) {
        arrayList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(arrayList.contains(o)){
            arrayList.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer o : arrayList){
            o.update(this.temperature, this.pressure, this.humidity);
        }
    }
}
