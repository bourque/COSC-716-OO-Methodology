class Driver{

    public static void main(String[] args){

    // Create menu
    Menu menu = new Menu();

    // Create menu items
    MenuItem item1 = new MenuItem("Prime Rib", 1, false, 70.25f);
    MenuItem item2 = new MenuItem("Cheese", 1, false, 6.50f);
    MenuItem item3 = new MenuItem("Lasagna", 2, false, 22.15f);
    MenuItem item4 = new MenuItem("Lobster", 2, true, 99.99f);
    MenuItem item5 = new MenuItem("Bacon", 1, true, 12.99f);
    MenuItem item6 = new MenuItem("Cheese Cake", 3, false, 5.00f);
    MenuItem item7 = new MenuItem("Fruit", 2, true, 0.99f);

    // Append menu items to menu
    menu.append(item1);
    menu.append(item2);
    menu.append(item3);
    menu.append(item4);
    menu.append(item5);
    menu.append(item6);
    menu.append(item7);

    // Iterate over all items on the menu
    MenuIterator itr1 = menu.getAllItemsIterator();
    System.out.println("ALL MENU ITEMS");
    while (itr1.hasNext()) {
        MenuItem item = itr1.getItem();
        System.out.println(item.getName() + " $" + item.getPrice());
        itr1.next();
    }
    System.out.println();

    // Iterate over a specified item type
    MenuIterator itr2 = menu.getItemIterator(menu.MAIN_DISH);
    System.out.println("MAIN DISHES");
    while (itr2.hasNext()) {
        MenuItem item = itr2.getItem();
        System.out.println(item.getName() + " $" + item.getPrice());
        itr2.next();
    }
    System.out.println();

    // Iterate over a specified item type
    MenuIterator itr3 = menu.getHeartHealthyIterator();
    System.out.println("ALL HEART HEALTHY MENU ITEMS");
    while (itr3.hasNext()) {
        MenuItem item = itr3.getItem();
        System.out.println(item.getName() + " $" + item.getPrice());
        itr3.next();
    }
    System.out.println();

    // Iterator over main dishes under a given price
    MenuIterator itr4 = menu.getPriceIterator(15.00f);
    System.out.println("ALL ITEMS BELOW PRICE");
    while (itr4.hasNext()) {
        MenuItem item = itr4.getItem();
        System.out.println(item.getName() + " $" + item.getPrice());
        itr4.next();
    }
    System.out.println();

    }
}