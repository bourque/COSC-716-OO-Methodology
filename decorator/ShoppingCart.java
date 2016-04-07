import java.util.ArrayList;

public class ShoppingCart {

    public ArrayList<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getTotal() {

        float sum = 0;
        for(Item item:items) {
            sum += item.price;
        }

        return sum;
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (Item item:items) {
            sb.append(item + "\n");
        }

        return sb.toString();
    }
}