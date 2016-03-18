public class MenuItem{

    public String itemName;
    public int category;
    public boolean heartHealthy;
    public double price;

    /**
     * Constructor method
     * @param itemName - the name of the menu item
     * @param category - the item category. Can be 1 (Appetizer), 2 (main dish),
     *        or 3 (dessert)
     * @param heartHealthy - true/false if the menu item is heart healthy or not
     * @param price - the price of the menu item
     */
    public MenuItem(String itemName, int category, boolean heartHealthy, double price){

        this.itemName = itemName;
        this.category = category;
        this.heartHealthy = heartHealthy;
        this.price = price;
    }

    /**
     * Overrides the toString method
     */
    public String toString(){

        return this.itemName + ":\t\t" + this.category + "\t" + this.heartHealthy + "\t" + this.price;
    }

    /**
     * Return the menu item's price
     * @return price - the price of the menu item
     */
    public double getPrice(){
        return this.price;
    }

    /**
     * Return the menu item's category
     * @return category - the category of the menu item
     */
    public int getCategory(){
        return this.category;
    }

    /**
     * Return the menu item's name
     * @return itemName - the name of the menu item
     */
    public String getName(){
        return this.itemName;
    }

    /**
     * Return the menu item's heart healthy indicator
     * @return heartHealty - the heart healthy indicator of the menu item
     */
    public boolean getHeartHealthy(){
        return this.heartHealthy;
    }
}