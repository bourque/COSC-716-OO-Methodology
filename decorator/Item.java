public class Item {

    private String name;
    protected float price;
    protected String category;

    public Item(String name, float price, String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String toString() {
        return name + ": $" + price;
    }
}