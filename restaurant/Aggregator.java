public class Aggregator {

    public Menu menu;
    public Orders orders;
    public Tab tab;
    public Inventory inventory;
    public InventoryObserver inventoryObserver;

    public Aggregator() {
        orders = new Orders();
        inventory = new Inventory();
        menu = new Menu(inventory);
        inventoryObserver = new InventoryObserver(inventory);
    }

    public Inventory getInventory() {
        return inventory;
    }

    public Menu getMenu() {
        return menu;
    }

    public Orders getOrders() {
        return orders;
    }

    public Tab getTab() {
        Tab tab = new Tab(orders);
        return tab;
    }
}