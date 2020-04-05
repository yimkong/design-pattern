package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * author yg
 * description
 * date 2020/4/5
 */
public class WeatherData implements Subject {
    private float temp;
    private float humidity;
    private float pressure;
    private List<Observer> observerList = new ArrayList<>();

    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObserver() {
        observerList.forEach(x -> x.update(temp, humidity, pressure));
    }

    public void setMeasurements(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    public void measurementsChanged() {
       notifyObserver();
    }
}
