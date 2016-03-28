import java.util.ArrayList;

public class PurchasedItems {

    public ArrayList<Item> purchasedItems = new ArrayList();

    public void addItem(Item item) {
        purchasedItems.add(item);
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (Item pi:purchasedItems) {
            sb.append(pi + "\n");
        }

        return sb.toString();
    }
}