// contains reference to Menu object, other objects
// Just for access, not setting
// Return a clone of the object!

public class Aggregator {

    public Menu getMenu() {
        return new Menu();
    }
    // public Tabs getTabs();

    // NO addMenu!
}