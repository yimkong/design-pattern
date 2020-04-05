package observer;

/**
 * author yg
 * description
 * date 2020/4/5
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        //... 基于业务可以注册更多布告板观察者
        weatherData.setMeasurements(1,2,3);
        weatherData.setMeasurements(4,5,1);
    }
}
