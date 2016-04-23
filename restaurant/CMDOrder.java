public class CMDOrder implements Command {

    Aggregator agg;
    // ordered item

    public CMDOrder(Aggregator agg) {
        this.agg = agg;
    }

    public void execute() {
        // Place an order
    }
}