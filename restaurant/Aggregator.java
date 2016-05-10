/**
 * Aggregator object that contains the restaurant system data, such as
 * the menu, inventory, tab, specials, and orders.
 */
public class Aggregator {

    public Menu menu;
    public Orders orders;
    public Tab tab;
    public Specials specials;
    public Inventory inventory;
    public LowInventoryObserver lowInventoryObserver;

    /**
     * Constructor method.  Creates the system data.
     */
    public Aggregator() {
        orders = new Orders();
        inventory = new Inventory();
        menu = new Menu(inventory);
        specials = new Specials();
        lowInventoryObserver = new LowInventoryObserver(inventory);
    }

    /**
     * Return the inventory
     * @return Inventory - the inventory.
     */
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * Return the menu
     * @return Menu - the menu.
     */
    public Menu getMenu() {
        return menu;
    }

    /**
     * Return the ordered items
     * @return Orders - the ordered items.
     */
    public Orders getOrders() {
        return orders;
    }

    /**
     * Return the tab
     * @return Tab - the tab.
     */
    public Tab getTab() {
        Tab tab = new Tab(orders);
        return tab;
    }
}