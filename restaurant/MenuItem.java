public class MenuItem {

    public String itemName;
    public double price;

    /**
     * Constructor method
     * @param itemName - the name of the menu item
     * @param price - the price of the menu item
     */
    public MenuItem(String itemName, double price){

        this.itemName = itemName;
        this.price = price;
    }

    /**
     * Return the menu item's price
     * @return price - the price of the menu item
     */
    public double getPrice(){
        return this.price;
    }

    /**
     * Return the menu item's name
     * @return itemName - the name of the menu item
     */
    public String getName(){
        return this.itemName;
    }
}