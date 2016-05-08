public class InventoryObserver implements Observer {

    private Observable inventory;

    public InventoryObserver(Observable inventory)
    {
        this.inventory = inventory;
        inventory.register(this);
    }

    public void warn() {

        // Warn the system of low inventory
        System.out.println("\nLow inventory warning: ");

        // Find the item that has a low quantity and increase it
        for (InventoryItem item:((Inventory) inventory).inventory) {
            if (item.quantity < 10) {
                System.out.println("\t" + item.name + ": " + item.quantity + " remaining");
                System.out.println("\tAdding more " + item.name + "\n");
                item.addQuantity(10);
            }
        }
    }
}