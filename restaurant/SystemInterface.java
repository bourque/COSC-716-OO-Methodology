import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SystemInterface {

    public static Invoker invoker = new Invoker();

    public static String displayMenu() {

        // Get the menu
        Menu menu = invoker.displayMenu();

        // Convert to a string
        StringBuilder sb = new StringBuilder();
        sb.append("\nMenu:\n");
        sb.append("\tName:\t\tPrice\n");

        for (MenuItem item:menu.menu) {
            sb.append("\t" + item.name + ": ");
            sb.append(item.price + "\n");
        }

        return sb.toString();
    }


    public static String submitOrder() {

        OrderItem orderedItem = null;
        String order = null;
        String orderConfirmation = "\nItem not on the menu. Please try again.";

        // Get ordered item from user
        System.out.println("\nPlease enter item you would like to order:");
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

        return orderConfirmation;
    }

}