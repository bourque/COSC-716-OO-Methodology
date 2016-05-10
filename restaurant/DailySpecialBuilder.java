/**
 * SpecialBuilder object that builds a daily special based on
 * inventory quantities.  A daily special is comprised of inventory
 * items that are in excess (i.e. have the most quantity).
 */
public class DailySpecialBuilder implements SpecialBuilder {

    private Special special;
    private Inventory inventory;

    /**
     * Constructor method.  Links the inventory
     * @param Inventory - The inventory.
     */
    public DailySpecialBuilder(Inventory inventory) {
        this.special = new Special("Daily");
        this.inventory = inventory;
    }

    /**
     * Build the main item of the special.
     */
    public void buildMain() {

        // Get the main inventory item with least quantity
        int quantity = 0;
        InventoryItem foundItem = null;
        for (InventoryItem item:inventory.inventory){
            if (item.type.equals("Main") && item.quantity > quantity) {
                quantity = item.quantity;
                foundItem = item;
            }
        }
        special.setMain(foundItem);
    }

    /**
     * Build the vegetable item of the special.
     */
    public void buildVegetable() {

        // Get the vegetable inventory with least quantity
        int quantity = 0;
        InventoryItem foundItem = null;
        for (InventoryItem item:inventory.inventory){
            if (item.type.equals("Vegetable") && item.quantity > quantity) {
                quantity = item.quantity;
                foundItem = item;
            }
        }
        special.setVegetable(foundItem);
    }

    /**
     * Build the side item of the special.
     */
    public void buildSide() {

        // Get the side inventory with least quantity
        int quantity = 0;
        InventoryItem foundItem = null;
        for (InventoryItem item:inventory.inventory){
            if (item.type.equals("Side") && item.quantity > quantity) {
                quantity = item.quantity;
                foundItem = item;
            }
        }
        special.setSide(foundItem);
    }

    /**
     * Build the name of the special.
     */
    public void buildName() {
        special.setName();
    }

    /**
     * Build the price of the special.
     */
    public void buildPrice() {
        special.setPrice();
    }

    /**
     * Return the special.
     * @return Special - the special.
     */
    public Special getSpecial() {
        return special;
    }
}