import java.util.ArrayList;

public class Tab {

    public Orders orders;
    public float total = 0.0f;

    public Tab(Orders orders) {
        this.orders = orders;
        total = getTotal();
    }

    private float getTotal() {

        for (OrderItem orderedItem:orders.orders) {
            total += orderedItem.price;
        }

        return total;
    }
}