/**
 * Command object for displaying the tab.
 */
public class CMDDisplayTab implements Command {

    private Aggregator agg;

    /**
     * Constructor method.  Links the aggregator.
     * @param Aggregator - The aggregator.
     */
    public CMDDisplayTab(Aggregator agg) {
        this.agg = agg;
    }

    /**
     * Execute the displayTab command.
     * @return Tab - The tab.
     */
    public Tab execute() {
        return agg.getTab();
    }
}