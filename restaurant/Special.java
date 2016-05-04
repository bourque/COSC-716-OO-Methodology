public class Special {

    public String type;
    public InventoryItem main;
    public InventoryItem vegetable;
    public InventoryItem side;
    public String name;
    public float price;

    public Special(String type) {
        this.type = type;
    }

    public void setMain(InventoryItem main) {
        this.main = main;
    }

    public void setVegetable(InventoryItem vegetable) {
        this.vegetable = vegetable;
    }

    public void setSide(InventoryItem side) {
        this.side = side;
    }

    public void setName() {
        this.name = this.main.name + " with " + this.vegetable.name + " and " + this.side.name;
    }

    public void setPrice() {
        this.price = this.main.price + this.vegetable.price + this.side.price;
    }
}