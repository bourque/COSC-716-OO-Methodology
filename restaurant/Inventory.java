import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Inventory implements Observable {

    public ArrayList<InventoryItem> inventory;
    private ArrayList<Observer> observers;

    public Inventory() {
        inventory = new ArrayList<InventoryItem>();
        observers = new ArrayList<Observer>();
        buildInventory();
    }

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

    public void register(Observer observer) {
        observers.add(observer);
    }

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

    public void unregister(Observer observer) {
        // remove observer
    }

    public void warn() {

        for(Observer observer:observers) {
            observer.update();
        }
    }
}