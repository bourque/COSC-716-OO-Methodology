import java.util.ArrayList;

public class Menu {

    public ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
    public Inventory inventory;

    public Menu(Inventory inventory) {
        this.inventory = inventory;
        buildMenu();
    }

    private void buildMenu(){

        // Dish 1
        MenuItem item0 = new MenuItem("Roasted Chicken", 7.15, inventory.getItem("Chicken"), inventory.getItem("Asparagus"), inventory.getItem("Biscuit"));
        // MenuItem item1 = new MenuItem("New York Strip", 8.25,);
        // MenuItem item2 = new MenuItem("Salmon", 70.25);
        // MenuItem item3 = new MenuItem("Pot Roast", 6.75);
        // MenuItem item4 = new MenuItem("Lobser Dinner", 14.15);

        menu.add(item0);
        // menu.add(item1);
        // menu.add(item2);
        // menu.add(item3);
        // menu.add(item4);
    }
}