public class UserInterface {

    SystemInterface si;

    public UserInterface() {
        this.si = new SystemInterface();
    }

    public void runInterface() {

        // Print out options for the user

        String fullMenu = si.getFullMenu();
        System.out.println(fullMenu);
    }
}