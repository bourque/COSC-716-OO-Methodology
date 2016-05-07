public class InventoryObserver implements Observer {

    private Observable inventory;

    public InventoryObserver(Observable inventory)
    {
        this.inventory = inventory;
        inventory.register(this);
    }

    public void warn() {
        System.out.println("Warning");
    }
}