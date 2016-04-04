import java.util.ArrayList;

public class ShoppingCart {

    public ArrayList<Item> shoppingCart = new ArrayList();

    public void addItem(Item item) {
        shoppingCart.add(item);
    }

    public Double getTotal() {

        double sum = 0;
        for(Item d:shoppingCart) {
            sum += d.price;
        }

        return sum;
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (Item pi:shoppingCart) {
            sb.append(pi + "\n");
        }

        return sb.toString();
    }
}