/**
 * The invoker. Creates and executes Command objects based on the
 * methods of the system interface.
 */
public class Invoker {

    private Aggregator agg;

    /**
     * Constructor method.  Creates a new Aggregator object, which
     * holds the restaurant data.
     */
    public Invoker() {
        this.agg = new Aggregator();
    }

    /**
     * Display the restarant menu.
     * @return Menu - The menu.
     */
    public Menu displayMenu() {
        return new CMDDisplayMenu(agg).execute();
    }

    /**
     * Display the specials.
     * @return Specials - The specials.
     */
    public Specials displaySpecials() {
        return new CMDDisplaySpecials(agg).execute();
    }

    /**
     * Display the tab.
     * @return Tab - The tab.
     */
    public Tab displayTab() {
        return new CMDDisplayTab(agg).execute();
    }

    /**
     * Submit and order.
     * @param OrderItem - The ordered item.
     * @return String - The order confirmation.
     */
    public String submitOrder(OrderItem orderedItem) {
        return new CMDSubmitOrder(agg, orderedItem).execute();
    }
}