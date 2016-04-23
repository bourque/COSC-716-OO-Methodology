import java.util.ArrayList;

public class Menu {

    public ArrayList<MenuItem> menu = new ArrayList<MenuItem>();

    public Menu() {

        buildMenu();
    }

    private void buildMenu(){
        MenuItem item0 = new MenuItem("Ice Cream", 7.15);
        MenuItem item1 = new MenuItem("Salad", 8.25);
        MenuItem item2 = new MenuItem("Prime Rib", 70.25);
        MenuItem item3 = new MenuItem("Cheese", 6.75);
        MenuItem item4 = new MenuItem("Lasagna", 14.15);
        MenuItem item5 = new MenuItem("Lobster", 99.99);
        MenuItem item6 = new MenuItem("Bacon", 12.99);
        MenuItem item7 = new MenuItem("Cheese Cake", 5.75);
        MenuItem item8 = new MenuItem("Pizza", 8.99);
        MenuItem item9 = new MenuItem("Cheerios", 2.25);

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