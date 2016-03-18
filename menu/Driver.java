/*
Matthew Bourque
3/22/2016
Homework Assignment 3
*/

class Driver{

    /**
     * The main driver
     */
    public static void main(String[] args){

    // Create menu
    Menu menu = new Menu();

    // Create menu items
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

    // Append menu items to menu
    menu.addItem(item0);
    menu.addItem(item1);
    menu.addItem(item2);
    menu.addItem(item3);
    menu.addItem(item4);
    menu.addItem(item5);
    menu.addItem(item6);
    menu.addItem(item7);
    menu.addItem(item8);
    menu.addItem(item9);

    // Display all menu items
    MenuIterator itr1 = menu.getAllItemsIterator();
    System.out.println("\nAll menu items");
    while (itr1.hasNext()) {
        MenuItem item = itr1.getItem();
        System.out.println("\t" + item.getName() + " $" + item.getPrice());
        itr1.next();
    }

    // Display all appetizers
    MenuIterator itr2 = menu.getItemIterator(menu.APPETIZER);
    System.out.println("\nAll appetizers");
    while (itr2.hasNext()) {
        MenuItem item = itr2.getItem();
        System.out.println("\t" + item.getName() + " $" + item.getPrice());
        itr2.next();
    }

    // Display all main dishes
    MenuIterator itr3 = menu.getItemIterator(menu.MAIN_DISH);
    System.out.println("\nAll main dishes");
    while (itr3.hasNext()) {
        MenuItem item = itr3.getItem();
        System.out.println("\t" + item.getName() + " $" + item.getPrice());
        itr3.next();
    }

    // Display all desserts
    MenuIterator itr4 = menu.getItemIterator(menu.DESSERT);
    System.out.println("\nAll desserts");
    while (itr4.hasNext()) {
        MenuItem item = itr4.getItem();
        System.out.println("\t" + item.getName() + " $" + item.getPrice());
        itr4.next();
    }

    // Display all heart healthy items
    MenuIterator itr5 = menu.getHeartHealthyIterator();
    System.out.println("\nAll heart healthy items");
    while (itr5.hasNext()) {
        MenuItem item = itr5.getItem();
        System.out.println("\t" + item.getName() + " $" + item.getPrice());
        itr5.next();
    }

    // Iterator over main dishes under a given price
    MenuIterator itr6 = menu.getPriceIterator(15.00f);
    System.out.println("\nAll main dishes under $15.00");
    while (itr6.hasNext()) {
        MenuItem item = itr6.getItem();
        System.out.println("\t" + item.getName() + " $" + item.getPrice());
        itr6.next();
    }
    }
}