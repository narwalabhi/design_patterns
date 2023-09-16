package behavioral.observer;

public class Main {

    public static void main(String[] args) {

        OrderService orderService = new OrderService();
        InventoryService inventoryService = new InventoryService();
        NotificationService notificationService = new NotificationService();

        ECommerceStore store = new ECommerceStore();

        store.registerObserver(orderService);
        store.registerObserver(inventoryService);
        store.registerObserver(notificationService);

        store.deregisterObserver(orderService);

        store.notifyObservers("Order 123 has been placed");

    }

}
