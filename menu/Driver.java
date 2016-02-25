class Driver{

    public static void main(String[] args){

    // Create menu
    Menu menu = new Menu();

    // Create menu items
    MenuItem item1 = new MenuItem("Prime Rib", 2, false, 99.99f);
    MenuItem item2 = new MenuItem("Cheese", 1, false, 9.99f);

    // Append menu items to menu
    menu.append(item1);
    menu.append(item2);

    System.out.println(menu);

    MenuIterator itr1 = menu.getAllItemsIterator();
    itr1.next();

    }

}