/**
 * An observer object that observes the Inventory object for low
 * inventory of a particular item(s).  If the quantity of an
 * inventory item drops below 10, a warning is sent to the system and
 * more inventory is added.
 */
public class LowInventoryObserver implements Observer {

    private Observable inventory;

    /**
     * Constructor method.  Links the inventory and registers the
     * observer with the Inventory object.
     */
    public LowInventoryObserver(Observable inventory)
    {
        this.inventory = inventory;
        inventory.register(this);
    }

    /**
     * Warns the system of low inventory and determines which
     * inventory items require an increase in quantity.  Such items
     * are increased by 10.
     */
    public void update() {

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