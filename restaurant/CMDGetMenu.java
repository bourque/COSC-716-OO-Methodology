public class CMDGetMenu implements Command {

    Aggregator agg;

    public CMDGetMenu(Aggregator agg) {
        this.agg = agg;
    }

    public Menu execute() {
        return agg.getMenu();
    }
}