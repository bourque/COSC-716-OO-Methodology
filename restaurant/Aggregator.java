public class Aggregator {

    Menu menu;
    Orders orders;
    Tab tab;

    public Aggregator() {
        menu = new Menu();
        orders = new Orders();
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