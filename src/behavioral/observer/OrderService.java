package behavioral.observer;

public class OrderService implements Observer{

    @Override
    public void update(String message) {
        System.out.println("OrderService received message: " + message);
    }

}
