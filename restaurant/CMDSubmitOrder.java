public class CMDSubmitOrder implements Command {

    private Aggregator agg;
    private OrderItem orderedItem;

    public CMDSubmitOrder(Aggregator agg, OrderItem orderedItem) {
        this.agg = agg;
        this.orderedItem = orderedItem;
    }

    public String execute() {

        // Add order to Orders
        Orders orders = agg.getOrders();
        orders.addOrder(orderedItem);

        // Remove necessary inventory
        MenuItem item = agg.menu.getItem(orderedItem.name);
        agg.inventory.removeInventory(item.main);
        agg.inventory.removeInventory(item.vegetable);
        agg.inventory.removeInventory(item.side);

        // Implement to remove specials from inventory

        return "Order confirmed: " + orderedItem.name + ": " + orderedItem.price;
    }
}