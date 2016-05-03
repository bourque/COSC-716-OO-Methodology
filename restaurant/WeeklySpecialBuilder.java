public class WeeklySpecialBuilder implements SpecialBuilder {

    Special special;
    Inventory inventory;

    public WeeklySpecialBuilder(Inventory inventory) {
        this.special = new Special();
        this.inventory = inventory;
    }

    public void buildMain() {
        // Get the main inventory item with nearest perishability
        special.setMain(inventory.getItem("Chicken"));
    }

    public void buildVegetable() {
        // Get the vegetable inventory with nearest perishability
        special.setVegetable(inventory.getItem("Asparagus"));
    }

    public void buildSide() {
        // Get the side inventory with nearest perishability
        special.setSide(inventory.getItem("Biscuit"));
    }

    public Special getSpecial() {
        return special;
    }
}