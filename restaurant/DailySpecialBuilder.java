public class DailySpecialBuilder implements SpecialBuilder {

    Special special;
    Inventory inventory;

    public DailySpecialBuilder(Inventory inventory) {
        this.special = new Special("Daily");
        this.inventory = inventory;
    }

    public void buildMain() {
        // Get the main inventory item with least quantity
        special.setMain(inventory.getItem("Chicken"));
    }

    public void buildVegetable() {
        // Get the vegetable inventory with least quantity
        special.setVegetable(inventory.getItem("Asparagus"));
    }

    public void buildSide() {
        // Get the side inventory with least quantity
        special.setSide(inventory.getItem("Biscuit"));
    }

    public Special getSpecial() {
        return special;
    }
}