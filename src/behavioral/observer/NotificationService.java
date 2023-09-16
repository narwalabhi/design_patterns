package behavioral.observer;

public class NotificationService implements Observer {
    @Override
    public void update(String message) {
        System.out.println("NotificationService received message: " + message);
    }

}
