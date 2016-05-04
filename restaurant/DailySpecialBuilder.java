public class DailySpecialBuilder implements SpecialBuilder {

    Special special;
    Inventory inventory;

    public DailySpecialBuilder(Inventory inventory) {
        this.special = new Special("Daily");
        this.inventory = inventory;
    }

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

    public void buildName() {
        special.setName();
    }

    public void buildPrice() {
        special.setPrice();
    }

    public Special getSpecial() {
        return special;
    }
}