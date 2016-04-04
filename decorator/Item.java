public class Item {

    private String name;
    protected double price;

    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + ": $" + price;
    }
}