import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class Driver {

    public static void main(String[] args) {

        // Get the date
        Calendar date = getDate();

        // Get the list of available items
        ArrayList<Item> availableItems = getAvailableItems();

        // Display the available items to the user
        displayAvailableItems(availableItems);

        // Get user selection
        ShoppingCart shoppingCart = getPurchasedItems(availableItems);

        // Print receipt
        try {
            ReceiptFactory rf = new ReceiptFactory();
            Receipt receipt = rf.getReceipt(shoppingCart, date);
            receipt.printReceipt();
        } catch (UnknownAddOnTypeException e) {
            System.out.println(e);
        } catch (UnknownStateTaxComputationException e) {
            System.out.println(e);
        }
    }

    private static void displayAvailableItems(ArrayList<Item> availableItems) {

        System.out.println("\nAvailable Products:");
        System.out.println("\tName\tPrice");

        for (int i=1; i<=availableItems.size(); i++) {
            System.out.println("Item " + i + " - " + availableItems.get(i - 1));
        }

        System.out.println("\nPlease select the item(s) you wish to purchase");
        System.out.println("Enter 'q' when finished");
    }

    private static ArrayList<Item> getAvailableItems() {

        // Initialize empty list to hold available items
        ArrayList<Item> availableItems = new ArrayList<Item>();

        try {

            // Read in the available items
            Scanner scanner = new Scanner(new File("available_items.dat"));
            while(scanner.hasNext()) {

                // Parse each line
                String next = scanner.nextLine();
                String[] line = next.split(",");
                String name = line[0];
                float price = Float.parseFloat(line[1]);
                String category = line[2];

                // Add item to list of available items
                Item item = new Item(name, price, category);
                availableItems.add(item);
            }
            scanner.close();

        } catch(FileNotFoundException e) {
            System.out.println("Error " + e.toString());
            System.exit(1);
        }

        return availableItems;
    }

    private static Calendar getDate() {

        Date date = null;
        System.out.println("\nPlease enter the date in YYYY-MM-DD format:");

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            df.setLenient(false);
            try {
                date = df.parse(line);
            } catch (ParseException e) {
                System.out.println("Error " + e.toString());
                System.exit(1);
            }
        } catch(IOException e) {
            System.out.println("Error " + e.toString());
            System.exit(1);
        }

        // Convert date to calendar since date is mostly depricated
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        return calendar;
    }

    private static ShoppingCart getPurchasedItems(ArrayList<Item> availableItems) {

        ShoppingCart shoppingCart = new ShoppingCart();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();

            while(!line.equals("q")) {

                // If the user selects to quit, then quit
                if (line.equals("q")) {
                    break;

                // if the user enters a valid item number, then add it to the cart
                } else if (line.matches("\\d+") && Integer.parseInt(line) >= 1 && Integer.parseInt(line) <= availableItems.size()) {
                    int itemNumber = Integer.parseInt(line);
                    Item item = availableItems.get(itemNumber - 1);
                    shoppingCart.addItem(item);
                    System.out.println("\nAdded item " + itemNumber + " to cart.");

                // if the user enters an invalid reponse, then let the user try again
                } else {
                    System.out.println("\nNot a valid selection. Please try again.");
                }

                // Display current shopping cart
                System.out.println("\nThe current shopping cart includes:");
                System.out.println(shoppingCart);

                // Let user make another selection
                System.out.println("\nPlease select the item(s) you wish to purchase");
                System.out.println("press 'q' when finished");
                line = br.readLine();
            }
        } catch(IOException e) {
            System.out.println("Error " + e.toString());
            System.exit(1);
        }

        System.out.println("");

        return shoppingCart;
    }
}