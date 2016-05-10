/**
 * Object that represents a special.  Like a menu item, it contains a
 * name, price, a main dish, a vegetable, and a side.  However, the
 * name is set based on the inventory items that make up the special,
 * since these can dynamically change.  A special also has a type,
 * which describes the type of special (e.g. Daily, Weekly, etc.).
 */
public class Special {

    public String type;
    public InventoryItem main;
    public InventoryItem vegetable;
    public InventoryItem side;
    public String name;
    public float price;

    /**
     * Constructor method.  Links the given type.
     * @param String - The type of special (e.g. Daily).
     */
    public Special(String type) {
        this.type = type;
    }

    /**
     * Set the main item.
     * @param InventoryItem - The main item.
     */
    public void setMain(InventoryItem main) {
        this.main = main;
    }

    /**
     * Set the name of the special based on the inventory items
     */
    public void setName() {
        this.name = this.main.name + " with " + this.vegetable.name + " and " + this.side.name;
    }

    /**
     * Set the price of the special based on the prices of the
     * individual inventory items.  Specials also get an extra 10%
     * discount.
     */
    public void setPrice() {
        this.price = this.main.price + this.vegetable.price + this.side.price;
        this.price = this.price - (this.price * 0.10f);
    }

    /**
     * Set the side item.
     * @param InventoryItem - The side item.
     */
    public void setSide(InventoryItem side) {
        this.side = side;
    }

    /**
     * Set the vegetable item.
     * @param InventoryItem - The vegetable item.
     */
    public void setVegetable(InventoryItem vegetable) {
        this.vegetable = vegetable;
    }
}