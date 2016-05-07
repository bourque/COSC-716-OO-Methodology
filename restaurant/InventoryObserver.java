public class InventoryObserver implements Observer {

    public Observable observable;

    public InventoryObserver(Observable inventory)
    {
        this.observable = inventory;
        inventory.register(this);
    }

    public void warn() {
        System.out.println("Warning");
    }
}