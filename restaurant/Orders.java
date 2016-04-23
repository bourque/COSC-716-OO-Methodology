import java.util.ArrayList;

public class Orders {

    public ArrayList<OrderItem> orders;

    public Orders() {
        this.orders = new ArrayList<OrderItem>();
    }

    public void addOrder(OrderItem order) {
        orders.add(order);
    }
}