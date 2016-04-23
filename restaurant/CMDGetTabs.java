public class CMDGetTabs implements Command {

    Aggregator agg;

    public CMDGetTabs(Aggregator agg) {
        this.agg = agg;
    }

    public Menu execute() {
        return agg.getTabs();
    }
}