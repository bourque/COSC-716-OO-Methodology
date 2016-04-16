// Determines which command class accomplishes task and gives reference of aggregator

public class Invoker {

    public Menu getMenu() {

        return new CMDGetMenu(agg).execute();
    }

    public void SaveCMDObject() {

    }
}