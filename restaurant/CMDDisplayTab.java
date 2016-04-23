public class CMDDisplayTab implements Command {

    Aggregator agg;

    public CMDDisplayTab(Aggregator agg) {
        this.agg = agg;
    }

    public Tab execute() {
        return agg.getTab();
    }
}