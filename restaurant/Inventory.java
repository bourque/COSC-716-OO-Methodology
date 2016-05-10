import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Object that represents a inventory available to the restarant.  The
 * inventory is a list of inventoryItem objects.  The inventory is also
 * an Observable type and notifies Observers when an item is
 * used/removed from the inventory.
 */
public class Inventory implements Observable {

    public ArrayList<InventoryItem> inventory;
    private ArrayList<Observer> observers;

    /**
     * Constructor method.  Initializes the list of inventory items and
     * the list of observers.  Also builds the inventory, which is read
     * in from a file.
     */
    public Inventory() {
        inventory = new ArrayList<InventoryItem>();
        observers = new ArrayList<Observer>();
        buildInventory();
    }

    /**
     * Construct the inventory, which is read in from a file.  Each
     * line of the file contains the inventory item name, type,
     * quantity, expiration date, and price (comma-separated).
     */
    private void buildInventory() {

        Calendar cal = Calendar.getInstance();

        // Read in the file
        try {
            Scanner scanner = new Scanner(new File("inventory.txt"));
            while(scanner.hasNext()) {

                // Parse the line
                String next = scanner.nextLine();
                String[] line = next.split(",");
                String name = line[0];
                String type = line[1];
                int qty = Integer.parseInt(line[2]);
                String dateString = line[3];
                float price = Float.parseFloat(line[4]);

                // Convert date to Date object
                String[] dateSplit = dateString.split("-");
                int year = Integer.parseInt(dateSplit[0]);
                int month = Integer.parseInt(dateSplit[1]);
                int day = Integer.parseInt(dateSplit[2]);
                cal.set(year, month, day);
                Date expiration = cal.getTime();

                // Add item to inventory
                inventory.add(new InventoryItem(name, type, qty, expiration, price));
            }

        } catch(FileNotFoundException e) {
            System.out.println("Error " + e.toString());
            System.exit(1);
        }
    }

    /**
     * Return the inventory item that matches the given name.
     * @param String - The item name.
     * @return InventoryItem - The inventory item that matches the
     *                         given name.
     */
    public InventoryItem getItem(String name) {

        InventoryItem foundItem = null;
        for (InventoryItem item:inventory) {
            if (item.name.equals(name)) {
                foundItem = item;
                break;
            }
        }

        return foundItem;
    }

    /**
     * Register the given Observer object (i.e. add it to the list of
     * observers).
     * @param Observer - The observer.
     */
    public void register(Observer observer) {
        observers.add(observer);
    }

    /**
     * "Remove" the given inventory item from the item (i.e. the item
     * was used in an order).
     * @param InventoryItem - The inventory item.
     */
    public void removeInventory(InventoryItem item) {

        // remove from inventory and notify observer if necessary
        for (InventoryItem i:inventory) {
            if (item.name.equals(i.name)) {
                i.quantity -= 1;
                if (i.quantity < 10) {
                    warn();
                }
                break;
            }
        }
    }

    /**
     * Unregister the given Observer object (i.e. remove it from the
     * list of observers).
     * @param Observer - The observer.
     */
    public void unregister(Observer observer) {
        // to implement: remove observer from registered observers
        // Not really needed for this project
    }

    /**
     * Warn the observers that a change in state happened.
     * @param InventoryItem - The inventory item.
     */
    public void warn() {

        for(Observer observer:observers) {
            observer.update();
        }
    }
}