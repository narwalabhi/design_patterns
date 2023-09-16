package behavioral.observer;

public class InventoryService implements Observer{

    @Override
    public void update(String message) {
        System.out.println("InventoryService received message: " + message);
    }

}
