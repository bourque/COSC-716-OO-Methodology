// Determines which command class accomplishes task and gives reference of aggregator

public class Invoker {

    Aggregator agg;

    public Invoker() {
        this.agg = new Aggregator();
    }

    public Menu DisplayMenu() {
        return new CMDDisplayMenu(agg).execute();
    }


}