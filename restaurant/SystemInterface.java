// static methods! make up the API
// converts objects returned from invoker to stings (or other native java things)
// Define toStrings

public class SystemInterface {

    public static Invoker invoker = new Invoker();

    public static String getFullMenu() {

        // Get the menu
        Menu menu = invoker.getMenu();

        // Convert to a string
        StringBuilder sb = new StringBuilder();
        sb.append("\nMenu:\n");
        sb.append("\tName:\t\tPrice\n");

        for (MenuItem item:menu.menu) {
            sb.append("\t" + item.itemName);
            sb.append("\t" + item.price + "\n");
        }

        return sb.toString();
    }


    public static void placeOrder() {

        invoker.placeOrder();
    }

}