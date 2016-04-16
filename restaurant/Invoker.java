// Determines which command class accomplishes task and gives reference of aggregator

public class Invoker {

    Aggregator agg;

    public Invoker() {
        this.agg = new Aggregator();
    }

    public Menu getMenu() {
        return new CMDGetMenu(agg).execute();
    }

    // public void SaveCMDObject() {

    // }
}