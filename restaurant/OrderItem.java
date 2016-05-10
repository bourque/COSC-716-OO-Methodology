/**
 * Object that represents an ordered item, which is comprised of a name
 * and price.
 */
public class OrderItem {

    public String name;
    public float price;

    /**
     * Constructor method
     * @param name - the name of the ordered item
     * @param price - the price of the ordered item
     */
    public OrderItem(String name, float price){

        this.name = name;
        this.price = price;
    }
}