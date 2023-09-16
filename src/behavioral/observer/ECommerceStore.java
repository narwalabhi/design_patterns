package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ECommerceStore {

    List<Observer> observerList;

    public  ECommerceStore(){
        observerList = new ArrayList<>();
    }

    public void registerObserver(Observer observer){
        observerList.add(observer);
    }

    public void deregisterObserver(Observer observer){
        observerList.remove(observer);
    }

    public void notifyObservers(String message){
        for(Observer observer : observerList){
            observer.update(message);
        }
    }

}
