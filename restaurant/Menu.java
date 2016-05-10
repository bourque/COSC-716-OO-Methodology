import java.util.ArrayList;

/**
 * Menu object that contains the restaurant menu, which is comprised
 * of a name, price, and three inventory items (main, vegetable, side).
 */
public class Menu {

    public ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
    private Inventory inventory;

    /**
     * Constructor method.  Links the inventory and builds the menu.
     * @param Inventory - The inventory.
     */
    public Menu(Inventory inventory) {
        this.inventory = inventory;
        buildMenu();
    }

    /**
     * Build the menu.
     */
    private void buildMenu() {

        MenuItem item0 = new MenuItem("Roasted Chicken Dinner", 25.15f, inventory.getItem("Roasted Chicken"), inventory.getItem("Asparagus"), inventory.getItem("Biscuit"));
        MenuItem item1 = new MenuItem("New York Strip Dinner", 47.25f, inventory.getItem("New York Strip"), inventory.getItem("Salad"), inventory.getItem("Potatoes"));
        MenuItem item2 = new MenuItem("Salmon Dinner", 33.33f, inventory.getItem("Salmon"), inventory.getItem("Cauliflower"), inventory.getItem("White Rice"));
        MenuItem item3 = new MenuItem("Pot Roast Dinner", 39.75f, inventory.getItem("Pot Roast"), inventory.getItem("Carrots"), inventory.getItem("Potatoes"));
        MenuItem item4 = new MenuItem("Lobster Dinner", 75.10f, inventory.getItem("Lobster"), inventory.getItem("Corn"), inventory.getItem("Brown Rice"));

        menu.add(item0);
        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        menu.add(item4);
    }

    /**
     * Return an item from the menu that matches the given name
     * @param String - The name of the menu item.
     * @return MenuItem - The menu item that matches the given name.
     */
    public MenuItem getItem(String name) {

        MenuItem foundItem = null;
        for (MenuItem item:menu) {
            if (item.name.equals(name)) {
                foundItem = item;
                break;
            }
        }
        return foundItem;
    }
}