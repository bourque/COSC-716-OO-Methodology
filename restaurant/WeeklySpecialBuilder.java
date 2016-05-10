import java.util.Calendar;
import java.util.Date;

/**
 * SpecialBuilder object that builds a weekly special based on
 * inventory perishability.  A weekly special is comprised of inventory
 * items that have the earliest expiration date.
 */
public class WeeklySpecialBuilder implements SpecialBuilder {

    private Special special;
    private Inventory inventory;
    private Calendar cal;

    /**
     * Constructor method.  Links the inventory and creates a Calendar
     * instance
     * @param Inventory - The inventory.
     */
    public WeeklySpecialBuilder(Inventory inventory) {
        this.special = new Special("Weekly");
        this.inventory = inventory;
        this.cal = Calendar.getInstance();
    }

    /**
     * Build the main item of the special.
     */
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

    /**
     * Build the vegetable item of the special.
     */
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

    /**
     * Build the side item of the special.
     */
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