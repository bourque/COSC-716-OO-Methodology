public class Menu {

    public static final int APPETIZERS = 1;
    public static final int MAIN_DISH = 2;
    public static final int DESSERT = 3;

    // Create menu items
    MenuItem item1 = new MenuItem("Prime Rib", 2, False, 99.99);

    public AllItemsIterator getAllItemsIterator();
    public ItemIterator getItemIterator();
    public HeartHealthyIterator getHeartHealthyIterator();
    public PriceIterator getPriceIterator();
}