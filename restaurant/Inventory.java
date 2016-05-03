import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Inventory {

    public ArrayList<InventoryItem> inventory;

    public Inventory() {
        inventory = new ArrayList<InventoryItem>();
        buildInventory();
    }

    public void addInventory(InventoryItem item) {
        inventory.add(item);
    }

    private void buildInventory() {

        Calendar cal = Calendar.getInstance();

        cal.set(2016, Calendar.MAY, 10);
        Date chickenExpiration = cal.getTime();
        addInventory(new InventoryItem("Chicken", "Main", 25, chickenExpiration));

        cal.set(2016, Calendar.MAY, 24);
        Date asparagusExpiration = cal.getTime();
        addInventory(new InventoryItem("Asparagus", "Vegetable", 30, asparagusExpiration));

        cal.set(2016, Calendar.AUGUST, 29);
        Date biscuitExpiration = cal.getTime();
        addInventory(new InventoryItem("Biscuit", "Side", 55, biscuitExpiration));
    }

    public InventoryItem getItem(String name) {

        InventoryItem foundItem = null;
        for (InventoryItem item:inventory) {
            foundItem = item;
            if (foundItem.name.equals(name)) {
                break;
            }
        }

        return foundItem;
    }
}