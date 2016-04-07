public class Item {

    private String name;
    protected double price;
    protected String category;

    public Item(String name, double price, String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String toString() {
        return name + ": $" + price;
    }
}