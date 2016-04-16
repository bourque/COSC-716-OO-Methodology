import java.util.ArrayList;

public class Menu {

    public ArrayList<MenuItem> menu = new ArrayList<MenuItem>();

    public Menu() {

        buildMenu();
    }

    private void buildMenu(){
        MenuItem item1 = new MenuItem("Bacon", 1, true, 9.99);
        menu.add(item1);
    }
}