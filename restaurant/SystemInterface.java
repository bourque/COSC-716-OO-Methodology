import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * The system interface. Runs the user supplied commands and returns
 * string output for the user to view.
 */
public class SystemInterface {

    private static Invoker invoker = new Invoker();

    /**
     * Display the restarant menu.
     * @return String - The menu.
     */
    public static String displayMenu() {

        // Get the menu
        Menu menu = invoker.displayMenu();

        // Convert to a string
        StringBuilder sb = new StringBuilder();
        sb.append("\nMenu:\n");
        for (MenuItem item:menu.menu) {
            sb.append("\t" + item.name + ": " + item.price + "\n");
            sb.append("\t\t" + item.main.name + " with " + item.vegetable.name + " and " + item.side.name + "\n");
        }

        return sb.toString();
    }


    /**
     * Display the daily and weekly special.
     * @return String - The specials.
     */
    public static String displaySpecials() throws UnimplementedSpecialException {

        // Get the specials
        Specials specials = invoker.displaySpecials();

        // Convert to a string
        StringBuilder sb = new StringBuilder();
        for (Special special:specials.specials) {
            if (special.type.equals("Daily")) {
                sb.append("\nToday's specials:\n");
            } else if (special.type.equals("Weekly")) {
                sb.append("\nThis week's specials:\n");
            } else {
                throw new UnimplementedSpecialException(special.type);
            }

            sb.append("\t" + special.name + ": " + special.price);
        }

        return sb.toString();

    }


    /**
     * Display the tab.
     * @return String - The tab.
     */
    public static String displayTab() {

        // Get the tab
        Tab tab = invoker.displayTab();

        // Convert to string
        StringBuilder sb = new StringBuilder();
        sb.append("\nTab:\n");
        for (OrderItem item:tab.orders.orders) {
            sb.append("\t" + item.name + ": " + item.price + "\n");
        }
        sb.append("\n\tTotal: " + tab.total + "\n");

        return sb.toString();
    }


    /**
     * Submit an order.
     * @return String - The order confirmation.
     */
    public static String submitOrder() {

        OrderItem orderedItem = null;
        String order = null;
        String orderConfirmation = "\nItem not on the menu. Please try again.";

        // Get ordered item from user
        System.out.println("\nPlease enter the full name of the item you would like to order:");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            order = br.readLine();
        } catch(IOException e) {
            System.out.println("Error " + e.toString());
            System.exit(1);
        }

        // submit the order if the item is on the menu
        Menu menu = invoker.displayMenu();
        for (MenuItem item:menu.menu) {
            if (item.name.toLowerCase().equals(order.toLowerCase())) {
                orderedItem = new OrderItem(item.name, item.price);
                orderConfirmation = invoker.submitOrder(orderedItem);
                break;
            }
        }

        // submit the order if it is a special
        Specials specials = invoker.displaySpecials();
        for (Special special:specials.specials) {
            if (special.name.toLowerCase().equals(order.toLowerCase())) {
                orderedItem = new OrderItem(special.name, special.price);
                orderConfirmation = invoker.submitOrder(orderedItem);
                break;
            }
        }

        return orderConfirmation;
    }
}


/**
 * Custom exception for unimplemented special types (e.g. monthly
 * special)
 */
class UnimplementedSpecialException extends RuntimeException {

    public UnimplementedSpecialException(String specialType) {
        System.out.println("Special Type " + specialType + " is unimplemeneted");
    }
}