// static methods! make up the API
// converts objects returned from invoker to stings (or other native java things)
// Define toStrings

public class SystemInterface {

    public Invoker invoker;

    public SystemInterface() {
        this.invoker = new Invoker();
    }

    public String getFullMenu() {

        Menu menu = invoker.getMenu();
        System.out.println(menu);
        return "This is the menu";
    }

    // public static String getFullMenu(){}
    // public static String getDessertMenu(){}
    // public static String getWhateverMenu(){}
    // public void setMenuFormat(){}

}