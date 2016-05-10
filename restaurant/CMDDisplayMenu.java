/**
 * Command object for displaying the menu.
 */
public class CMDDisplayMenu implements Command {

    private Aggregator agg;

    /**
     * Constructor method.  Links the aggregator.
     * @param Aggregator - The aggregator.
     */
    public CMDDisplayMenu(Aggregator agg) {
        this.agg = agg;
    }

    /**
     * Execute the displayMenu command.
     * @return Menu - The menu.
     */
    public Menu execute() {
        return agg.getMenu();
    }
}