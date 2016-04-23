public class CMDSubmitOrder implements Command {

    Aggregator agg;
    MenuItem orderedItem;

    public CMDSubmitOrder(Aggregator agg, MenuItem orderedItem) {
        this.agg = agg;
        this.orderedItem = orderedItem;
    }

    public String execute() {
        // submit order
        return "Confirmed";
    }
}