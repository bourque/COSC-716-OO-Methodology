import java.util.Date;

/**
 * Object that represents an inventory item, which is comprised of a
 * name, type (i.e. Main, Vegetable, Side, etc.), quantity, expiration
 * date, and price.
 */
public class InventoryItem {

    public String name;
    public String type;
    public int quantity;
    public Date expiration;
    public float price;

    /**
     * Constructor method.
     * @param String - The name of the inventory item.
     * @param String - The type of the inventory item (e.g. Vegetable).
     * @param int - The quantity of the inventory item.
     * @param Date - The expiration date of the inventory item.
     * @param float - The price of the inventory item.
     */
    public InventoryItem(String name, String type, int quantity, Date expiration, float price) {
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.expiration = expiration;
        this.price = price;
    }

    /**
     * Add more quanitity to an inventory item
     * @param int - The amount to add.
     */
    public void addQuantity(int qty) {
        this.quantity += qty;
    }
}