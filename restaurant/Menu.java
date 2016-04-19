import java.util.ArrayList;

public class Menu {

    public ArrayList<MenuItem> menu = new ArrayList<MenuItem>();

    public Menu() {

        buildMenu();
    }

    private void buildMenu(){
        MenuItem item0 = new MenuItem("Ice Cream", 3, false, 7.15);
        MenuItem item1 = new MenuItem("Salad", 1, true, 8.25);
        MenuItem item2 = new MenuItem("Prime Rib", 2, false, 70.25);
        MenuItem item3 = new MenuItem("Cheese", 1, false, 6.75);
        MenuItem item4 = new MenuItem("Lasagna", 2, false, 14.15);
        MenuItem item5 = new MenuItem("Lobster", 2, false, 99.99);
        MenuItem item6 = new MenuItem("Bacon", 1, false, 12.99);
        MenuItem item7 = new MenuItem("Cheese Cake", 3, false, 5.75);
        MenuItem item8 = new MenuItem("Pizza", 2, false, 8.99);
        MenuItem item9 = new MenuItem("Cheerios", 1, true, 2.25);

        menu.add(item0);
        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        menu.add(item4);
        menu.add(item5);
        menu.add(item6);
        menu.add(item7);
        menu.add(item8);
        menu.add(item9);
    }
}