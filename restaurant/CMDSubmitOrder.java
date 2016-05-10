/**
 * Command object for submitting an order.
 */
public class CMDSubmitOrder implements Command {

    private Aggregator agg;
    private OrderItem orderedItem;

    /**
     * Constructor method.  Links the aggregator and the ordered item.
     * @param Aggregator - The aggregator.
     * @param OderItem - The ordered item.
     */
    public CMDSubmitOrder(Aggregator agg, OrderItem orderedItem) {
        this.agg = agg;
        this.orderedItem = orderedItem;
    }

    /**
     * Execute the submitOrder command.  Also remove necessary items
     * from the inventory.
     * @return String - The order confirmation.
     */
    public String execute() {

        // Add order to Orders
        Orders orders = agg.getOrders();
        orders.addOrder(orderedItem);

        // Remove necessary inventory
        try {
            MenuItem item = agg.menu.getItem(orderedItem.name);
            agg.inventory.removeInventory(item.main);
            agg.inventory.removeInventory(item.vegetable);
            agg.inventory.removeInventory(item.side);

        } catch (NullPointerException e) {
            Special special = agg.specials.getSpecial(orderedItem.name);
            agg.inventory.removeInventory(special.main);
            agg.inventory.removeInventory(special.vegetable);
            agg.inventory.removeInventory(special.side);
        }

        return "Order confirmed: " + orderedItem.name + ": " + orderedItem.price;
    }
}