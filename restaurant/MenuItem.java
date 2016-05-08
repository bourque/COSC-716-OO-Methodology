public class MenuItem {

    public String name;
    public float price;
    public InventoryItem main;
    public InventoryItem vegetable;
    public InventoryItem side;

    /**
     * Constructor method
     * @param name - the name of the menu item
     * @param price - the price of the menu item
     */
    public MenuItem(String name, float price, InventoryItem main, InventoryItem vegetable, InventoryItem side){

        this.name = name;
        this.price = price;
        this.main = main;
        this.vegetable = vegetable;
        this.side = side;
    }
}