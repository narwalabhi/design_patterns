package behavioral.observer.weatherForecast.observer;

public interface Observer {

    void update(float temperature, float humidity, float pressure);

}
