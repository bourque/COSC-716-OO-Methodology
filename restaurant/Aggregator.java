public class Aggregator {

    Menu menu;
    Orders orders;
    Tab tab;
    Inventory inventory;

    public Aggregator() {
        orders = new Orders();
        inventory = new Inventory();
        menu = new Menu(inventory);
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