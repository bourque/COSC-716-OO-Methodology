import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Driver {

    public static void main(String[] args) {

        // Get the list of available items
        ArrayList<Item> availableItems = new ArrayList();
        try {
            availableItems = getAvailableItems();
        } catch(FileNotFoundException e) {
            System.out.println("Error " + e.toString());
        }

        // Display the available items to the user
        System.out.println("\nAvailable Products:");
        System.out.println("\tName\tPrice");
        for (int i=1; i<=availableItems.size(); i++) {
            System.out.println("Item " + i + " - " + availableItems.get(i - 1));
        }
        System.out.println("\nPlease select the item(s) you wish to purchase");
        System.out.println("press 'q' when finished");

        // Get user selection
        PurchasedItems purchasedItems =  getPurchasedItems(availableItems);

        // ReceiptFactory rf = new ReceiptFactory(items, date);
        // Receipt receipt = rf.getReceipt();
        // receipt.printReceipt();
    }

    private static ArrayList<Item> getAvailableItems() throws FileNotFoundException {

        // Initialize empty list to hold available items
        ArrayList<Item> availableItems = new ArrayList();

        // Read in the available items
        Scanner scanner = new Scanner(new File("available_items.dat"));
        while(scanner.hasNext()) {

            // Parse each line
            String next = scanner.next();
            String[] line = next.split(",");
            String name = line[0];
            Double price = Double.parseDouble(line[1]);

            // Add item to list of available items
            Item item = new Item(name, price);
            availableItems.add(item);
        }
        scanner.close();

        return availableItems;
    }

    private static PurchasedItems getPurchasedItems(ArrayList<Item> availableItems) {

        PurchasedItems purchasedItems = new PurchasedItems();

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
                    purchasedItems.addItem(item);
                    System.out.println("\nAdded item " + itemNumber + " to cart.");

                // if the user enters an invalid reponse, then let the user try again
                } else {
                    System.out.println("\nNot a valid selection. Please try again.");
                }

                // Display current shopping cart
                System.out.println("\nThe current shopping cart includes:");
                System.out.println(purchasedItems);

                // Let user make another selection
                System.out.println("\nPlease select the item(s) you wish to purchase");
                System.out.println("press 'q' when finished");
                line = br.readLine();
            }
        } catch(IOException e) {
            System.out.println("Error " + e.toString());
        }

        // Print the finalized cart
        System.out.println("\nYour shopping cart includes:");
        System.out.println(purchasedItems);

        return purchasedItems;
    }
}