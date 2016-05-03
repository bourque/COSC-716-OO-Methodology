public class Special {

    public String type;
    public InventoryItem main;
    public InventoryItem vegetable;
    public InventoryItem side;

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
}