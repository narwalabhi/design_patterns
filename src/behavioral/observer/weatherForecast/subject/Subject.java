package behavioral.observer.weatherForecast.subject;

import behavioral.observer.weatherForecast.observer.Observer;

public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
