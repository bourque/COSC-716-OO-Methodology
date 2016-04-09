import java.util.ArrayList;

public class ShoppingCart {

    public ArrayList<Item> items = new ArrayList<Item>();


    /**
     * Add an item to the shopping cart
     * @param item - The item to add
     */
    public void addItem(Item item) {
        items.add(item);
    }


    /**
     * Return the sum of the items in the shopping cart
     * @return sum - The sum of the items
     */
    public float getTotal() {

        float sum = 0;
        for(Item item:items) {
            sum += item.price;
        }

        return sum;
    }


    /**
     * Override the toString method to custom print the shopping cart
     */
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (Item item:items) {
            sb.append(item + "\n");
        }

        return sb.toString();
    }
}