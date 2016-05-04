import java.util.ArrayList;

public class Menu {

    public ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
    public Inventory inventory;

    public Menu(Inventory inventory) {
        this.inventory = inventory;
        buildMenu();
    }

    private void buildMenu(){

        MenuItem item0 = new MenuItem("Roasted Chicken Dinner", 25.15f, inventory.getItem("Roasted Chicken"), inventory.getItem("Asparagus"), inventory.getItem("Biscuit"));
        MenuItem item1 = new MenuItem("New York Strip Dinner", 47.25f, inventory.getItem("New York Strip"), inventory.getItem("Salad"), inventory.getItem("Potatoes"));
        MenuItem item2 = new MenuItem("Salmon Dinner", 33.33f, inventory.getItem("Salmon"), inventory.getItem("Cauliflower"), inventory.getItem("White Rice"));
        MenuItem item3 = new MenuItem("Pot Roast Dinner", 39.75f, inventory.getItem("Pot Roast"), inventory.getItem("Carrots"), inventory.getItem("Potatoes"));
        MenuItem item4 = new MenuItem("Lobster Dinner", 75.10f, inventory.getItem("Lobster"), inventory.getItem("Corn"), inventory.getItem("Brown Rice"));

        menu.add(item0);
        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        menu.add(item4);
    }
}