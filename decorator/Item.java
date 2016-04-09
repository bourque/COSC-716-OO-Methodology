public class Item {

    protected String name;
    protected float price;
    protected String category;


    /**
     * Constructor method
     * @param name - The name of the item
     * @param price - The price of the item
     * @param category - The category of the item (e.g. computer, applience, etc.)
     */
    public Item(String name, float price, String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }


    /**
     * Overrides the toString method to custom display the item
     */
    public String toString() {
        return name + ": $" + price;
    }
}