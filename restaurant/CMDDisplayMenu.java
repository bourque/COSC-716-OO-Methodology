public class CMDDisplayMenu implements Command {

    Aggregator agg;

    public CMDDisplayMenu(Aggregator agg) {
        this.agg = agg;
    }

    public Menu execute() {
        return agg.getMenu();
    }
}