/**
 * Object that represents a menu item, which is comprised of a name,
 * price, a main dish, a vegetable, and a side.
 */
public class MenuItem {

    public String name;
    public float price;
    public InventoryItem main;
    public InventoryItem vegetable;
    public InventoryItem side;

    /**
     * Constructor method
     * @param name - the name of the menu item.
     * @param price - the price of the menu item.
     * @param main - The main inventory item.
     * @param vegetable - The vegetable inventory item.
     * @param side - The side inventory item.
     */
    public MenuItem(String name, float price, InventoryItem main, InventoryItem vegetable, InventoryItem side){

        this.name = name;
        this.price = price;
        this.main = main;
        this.vegetable = vegetable;
        this.side = side;
    }
}