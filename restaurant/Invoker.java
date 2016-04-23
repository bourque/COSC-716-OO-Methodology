// Determines which command class accomplishes task and gives reference of aggregator

public class Invoker {

    Aggregator agg;

    public Invoker() {
        this.agg = new Aggregator();
    }

    public Menu displayMenu() {
        return new CMDDisplayMenu(agg).execute();
    }

    public String submitOrder(MenuItem orderedItem) {
        return new CMDSubmitOrder(agg, orderedItem).execute();
    }
}