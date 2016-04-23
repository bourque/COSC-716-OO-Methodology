public class CMDSubmitOrder implements Command {

    Aggregator agg;
    OrderItem orderedItem;

    public CMDSubmitOrder(Aggregator agg, OrderItem orderedItem) {
        this.agg = agg;
        this.orderedItem = orderedItem;
    }

    public String execute() {

        // Add order to Orders
        Orders orders = agg.getOrders();
        orders.addOrder(orderedItem);

        return "Order confirmed: " + orderedItem.name + ": " + orderedItem.price;
    }
}