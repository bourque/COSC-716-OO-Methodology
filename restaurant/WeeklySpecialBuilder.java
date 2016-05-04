import java.util.Calendar;
import java.util.Date;

public class WeeklySpecialBuilder implements SpecialBuilder {

    Special special;
    Inventory inventory;
    Calendar cal;

    public WeeklySpecialBuilder(Inventory inventory) {
        this.special = new Special("Weekly");
        this.inventory = inventory;
        this.cal = Calendar.getInstance();
    }

    public void buildMain() {

        // Get the main inventory item with nearest perishability
        cal.set(9999, 1, 1);
        Date dateToCompare = cal.getTime();
        InventoryItem foundItem = null;
        for (InventoryItem item:inventory.inventory){
            Date expirationDate = item.expiration;
            if (item.type.equals("Main") && item.expiration.before(dateToCompare)) {
                dateToCompare = item.expiration;
                foundItem = item;
            }
        }
        special.setMain(foundItem);
    }

    public void buildVegetable() {

        // Get the vegetable inventory with nearest perishability
        cal.set(9999, 1, 1);
        Date dateToCompare = cal.getTime();
        InventoryItem foundItem = null;
        for (InventoryItem item:inventory.inventory){
            Date expirationDate = item.expiration;
            if (item.type.equals("Vegetable") && item.expiration.before(dateToCompare)) {
                dateToCompare = item.expiration;
                foundItem = item;
            }
        }
        special.setVegetable(foundItem);
    }

    public void buildSide() {

        // Get the side inventory with nearest perishability
        cal.set(9999, 1, 1);
        Date dateToCompare = cal.getTime();
        InventoryItem foundItem = null;
        for (InventoryItem item:inventory.inventory){
            Date expirationDate = item.expiration;
            if (item.type.equals("Side") && item.expiration.before(dateToCompare)) {
                dateToCompare = item.expiration;
                foundItem = item;
            }
        }
        special.setSide(foundItem);
    }

    public Special getSpecial() {
        return special;
    }
}