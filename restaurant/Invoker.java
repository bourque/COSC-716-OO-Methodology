// Determines which command class accomplishes task and gives reference of aggregator

public class Invoker {

    Aggregator agg;

    public Invoker() {
        this.agg = new Aggregator();
    }

    public Menu displayMenu() {
        return new CMDDisplayMenu(agg).execute();
    }

    public Specials displaySpecials() {
        return new CMDDisplaySpecials(agg).execute();
    }

    public Tab displayTab() {
        return new CMDDisplayTab(agg).execute();
    }

    public String submitOrder(OrderItem orderedItem) {
        return new CMDSubmitOrder(agg, orderedItem).execute();
    }
}