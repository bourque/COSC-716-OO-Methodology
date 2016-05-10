import java.util.ArrayList;

/**
 * Object that represents a tab, which is comprised of the various
 * ordered items, and the total cost.
 */
public class Tab {

    public Orders orders;
    public float total = 0.0f;

    /**
     * Constructor method.  Links the given orders and determines the
     * total cost.
     * @param Orders - The ordered items.
     */
    public Tab(Orders orders) {
        this.orders = orders;
        total = getTotal();
    }

    /**
     * Determine the total cost of the orders.
     * @return float - The total cost.
     */
    private float getTotal() {

        for (OrderItem orderedItem:orders.orders) {
            total += orderedItem.price;
        }

        return total;
    }
}