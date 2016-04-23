public class Aggregator {

    Menu menu;
    Orders orders;

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
}