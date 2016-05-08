public class CMDDisplayMenu implements Command {

    private Aggregator agg;

    public CMDDisplayMenu(Aggregator agg) {
        this.agg = agg;
    }

    public Menu execute() {
        return agg.getMenu();
    }
}