import java.util.ArrayList;

/**
 * Object that holds a list of orders.
 */
public class Orders {

    public ArrayList<OrderItem> orders;

    /**
     * Constructor method. Initializes the list.
     */
    public Orders() {
        this.orders = new ArrayList<OrderItem>();
    }

    /**
     * Add an ordered item to the list of orders.
     * @param OrderedItem - The ordered item.
     */
    public void addOrder(OrderItem order) {
        orders.add(order);
    }
}